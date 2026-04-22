package Object_Oriented_Programming.OOPs_Intermediate.Inheritance;

// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Electric Vehicle (inherits Vehicle)
class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging the electric vehicle...");
    }

    void displayInfo() {
        displayVehicleInfo();
        charge();
    }
}

// Petrol Vehicle (inherits + implements interface)
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implementing interface method
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    void displayInfo() {
        displayVehicleInfo();
        refuel();
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        System.out.println("=== Electric Vehicle ===");
        ev.displayInfo();

        System.out.println();

        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");
        System.out.println("=== Petrol Vehicle ===");
        pv.displayInfo();
    }
}
