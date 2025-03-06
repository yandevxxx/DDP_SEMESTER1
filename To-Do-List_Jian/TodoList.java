
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<TodoItem> items;
    String filename = "todolist.txt";

    public TodoList() {
        items = new ArrayList<>();
        loadTasks();
    }

    public void addTask(String task) {
        items.add(new TodoItem(task));
        saveTasks();
    }

    public void markTaskAsDone(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).markAsDone();
            saveTasks();
        } else {
            System.out.println("Task not found.");
        }
    }

    public void showTasks() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + " " + items.get(i));
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            saveTasks();
        } else {
            System.out.println("Task not found.");
        }
    }

    public void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (TodoItem item : items) {
                writer.write(item.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    private void loadTasks() {
        File file = new File(filename);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    items.add(TodoItem.fromFileString(line));
                }
            } catch (IOException e) {
                System.out.println("Error loading tasks: " + e.getMessage());
            }
        }
    }
}
