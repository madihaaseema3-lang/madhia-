java code for create a class which can shared by two objects(student) for name and marks in a subject
  class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating two Student objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Assigning values
        s1.name = "Rahul";
        s1.marks = 85;

        s2.name = "Priya";
        s2.marks = 92;

        // Displaying student details
        System.out.println("Student 1:");
        s1.display();

        System.out.println("\nStudent 2:");
        s2.display();
    }
}
