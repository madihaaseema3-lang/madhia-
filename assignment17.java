17.java code for managing a To Do list adding removing and iterating over a simple arraylist of tasks
  import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create an ArrayList to store tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Complete Java assignment");
        tasks.add("Study for exam");
        tasks.add("Go for a walk");
        tasks.add("Read a book");

        System.out.println("To-Do List:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        // Removing a task
        tasks.remove("Go for a walk");

        System.out.println("\nAfter removing a task:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        // Adding another task
        tasks.add("Practice coding");

        System.out.println("\nFinal To-Do List:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
