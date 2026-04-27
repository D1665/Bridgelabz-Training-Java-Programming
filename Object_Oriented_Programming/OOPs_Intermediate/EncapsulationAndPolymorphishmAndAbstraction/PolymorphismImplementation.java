package Object_Oriented_Programming.OOPs_Intermediate.EncapsulationAndPolymorphishmAndAbstraction;

// Polymorphism Demo Program

// 🔷 Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// 🔷 Child Class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// 🔷 Child Class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// 🔷 Method Overloading Example
class MathOperations {

    // Same method name, different parameters
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// 🔷 Main Class
public class PolymorphismImplementation {
    public static void main(String[] args) {

        // ==============================
        // 🔶 Runtime Polymorphism
        // ==============================

        Animal a; // reference of parent class

        a = new Dog();  // object of Dog
        a.sound();      // calls Dog's method

        a = new Cat();  // object of Cat
        a.sound();      // calls Cat's method


        // ==============================
        // 🔶 Compile-time Polymorphism
        // ==============================

        MathOperations obj = new MathOperations();

        System.out.println("Sum (int): " + obj.add(10, 20));
        System.out.println("Sum (double): " + obj.add(5.5, 2.5));
        System.out.println("Sum (3 ints): " + obj.add(1, 2, 3));
    }
}
