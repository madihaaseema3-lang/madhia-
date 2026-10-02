18.java code for accessing and removing elements in a linkedlist by using its operations
  import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original LinkedList: " + list);

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.removeFirst();
        System.out.println("After removing first element: " + list);

        list.removeLast();
        System.out.println("After removing last element: " + list);

        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        list.remove("Cherry");
        System.out.println("After removing Cherry: " + list);
    }
}
