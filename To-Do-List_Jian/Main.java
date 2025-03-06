
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        String command;

        while (true) {
            System.out.println("Commands: add, done, remove, show, exit");
            command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("add")) {
                System.out.print("Enter task: ");
                String task = scanner.nextLine();
                todoList.addTask(task);
            } else if (command.equalsIgnoreCase("done")) {
                System.out.print("Enter task index to mark as done: ");
                if (scanner.hasNextInt()) {
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    todoList.markTaskAsDone(index);
                } else {
                    System.out.println("Please enter a valid index.");
                    scanner.nextLine();
                }
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.print("Enter task index to remove: ");
                if (scanner.hasNextInt()) {
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    todoList.removeTask(index);
                } else {
                    System.out.println("Please enter a valid index.");
                    scanner.nextLine();
                }

            } else if (command.equalsIgnoreCase("show")) {
                todoList.showTasks();
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                scanner.close();
                return;
            } else {
                System.out.println("Unknown command.");
            }
        }
    }
}
