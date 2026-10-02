16.write a java code to implement the abraction by using shapes and 2 sub classes which can have the fuctionality in different ways
  abstract class Shape {
    // Abstract method
    abstract void area();

    // Normal method
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    // Different implementation for Circle
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    // Different implementation for Rectangle
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.display();
        s1.area();

        s2.display();
        s2.area();
    }
}
