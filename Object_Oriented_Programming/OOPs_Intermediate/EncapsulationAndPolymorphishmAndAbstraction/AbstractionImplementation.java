package Object_Oriented_Programming.OOPs_Intermediate.EncapsulationAndPolymorphishmAndAbstraction;

// Abstraction Demo Program

// 🔷 Abstract Class
abstract class Vehicle {

    // Abstract method (no body)
    abstract void start();

    // Concrete method (with body)
    void fuelType() {
        System.out.println("Vehicles use fuel or electricity");
    }
}

// 🔷 Interface (100% abstraction)
interface GPS {
    abstract void showLocation();
}

// 🔷 Child Class
class Car extends Vehicle implements GPS {

    // Implement abstract method
    @Override
    void start() {
        System.out.println("Car starts with key or button");
    }

    // Implement interface method
    @Override
    public void showLocation() {
        System.out.println("Showing location using GPS");
    }
}

// 🔷 Another Child Class
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with kick or self-start");
    }
}

// 🔷 Main Class
public class AbstractionImplementation {
    public static void main(String[] args) {

        // Cannot create object of abstract class
        // Vehicle v = new Vehicle(); ❌

        // ✅ Runtime behavior
        Vehicle v1 = new Car();
        v1.start();
        v1.fuelType();

        System.out.println();

        Vehicle v2 = new Bike();
        v2.start();
        v2.fuelType();

        System.out.println();

        // Interface reference
        GPS g = new Car();
        g.showLocation();
    }
}
