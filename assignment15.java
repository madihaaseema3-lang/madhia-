.write java code for method overidding a string where each class inherts to string from object and overiddibg that to see how the object can be printed
  class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding Object's toString()
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Overriding Object's toString()
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Rahul", 20);
        Employee e = new Employee("Amit", 50000);

        // Java automatically calls toString()
        System.out.println(s);
        System.out.println(e);

        // Same as:
        System.out.println(s.toString());
        System.out.println(e.toString());
    }
}
