write a java code to create hierarchy with class animal subclass dog,forrabbit
  // Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class
class Rabbit extends Animal {
    void jump() {
        System.out.println("Rabbit is jumping");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();    // Method inherited from Animal
        dog.bark();

        Rabbit rabbit = new Rabbit();
        rabbit.eat(); // Method inherited from Animal
        rabbit.jump();
    }
}
