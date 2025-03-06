
public class TodoItem {

    String task;
    boolean isDone;

    public TodoItem(String task) {
        this.task = task;
        this.isDone = false;
    }

    public String getTask() {
        return task;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markAsDone() {
        isDone = true;
    }

    @Override
    public String toString() {
        return (isDone ? "[X] " : "[ ] ") + task;
    }

    public String toFileString() {
        return (isDone ? "1" : "0") + "|" + task;
    }

    public static TodoItem fromFileString(String line) {
        String[] parts = line.split("\\|");
        TodoItem item = new TodoItem(parts[1]);
        if (parts[0].equals("1")) {
            item.markAsDone();
        }
        return item;
    }
}
