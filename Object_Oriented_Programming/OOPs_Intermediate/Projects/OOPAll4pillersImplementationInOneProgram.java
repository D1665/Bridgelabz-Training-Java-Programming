package Object_Oriented_Programming.OOPs_Intermediate.Projects;

// 🔷 INTERFACE (Abstraction + Diamond Problem)
interface GPS {
    default void show() {
        System.out.println("GPS from Interface 1");
    }
}

interface SmartFeatures {
    default void show() {
        System.out.println("Smart Feature Interface");
    }
}

// 🔷 ABSTRACT CLASS (Abstraction)
abstract class Vehicle {

    // 🔒 Encapsulation (private variable)
    private String brand;

    // Getter & Setter (Encapsulation)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Abstract Method
    abstract void start();

    // Concrete Method
    void fuelType() {
        System.out.println("Uses fuel or electricity");
    }
}

// 🔷 INHERITANCE + POLYMORPHISM + DIAMOND PROBLEM SOLUTION
class Car extends Vehicle implements GPS, SmartFeatures {

    // Method Overriding (Runtime Polymorphism)
    @Override
    void start() {
        System.out.println("Car starts with button");
    }

    // Resolving Diamond Problem
    @Override
    public void show() {
        System.out.println("Car resolves diamond problem");

        GPS.super.show();
        SmartFeatures.super.show();
    }
}

// 🔷 Another Child (Inheritance)
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

// 🔷 Method Overloading (Compile-time Polymorphism)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// 🔷 MAIN CLASS
public class OOPAll4pillersImplementationInOneProgram {
    public static void main(String[] args) {

        // ==============================
        // 🔶 Encapsulation
        // ==============================
        Car car = new Car();
        car.setBrand("BMW");
        System.out.println("Brand: " + car.getBrand());

        System.out.println();

        // ==============================
        // 🔶 Abstraction + Runtime Polymorphism
        // ==============================
        Vehicle v;

        v = new Car();
        v.start();       // Car method
        v.fuelType();

        System.out.println();

        v = new Bike();
        v.start();       // Bike method
        v.fuelType();

        System.out.println();

        // ==============================
        // 🔶 Diamond Problem (Interface)
        // ==============================
        car.show();

        System.out.println();

        // ==============================
        // 🔶 Compile-time Polymorphism
        // ==============================
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(10, 20));
        System.out.println("Sum (3 nums): " + calc.add(1, 2, 3));
    }
}