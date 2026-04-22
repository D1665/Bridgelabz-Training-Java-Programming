package Object_Oriented_Programming.OOPs_Intermediate.EncapsulationAndPolymorphishmAndAbstraction;

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation (Getters)
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    // Abstract Method
    abstract double calculateRentalCost(int days);
}

// Car Class
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // sensitive

    Car(String number, double rate, String policy) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500; // fixed
    }

    public String getInsuranceDetails() {
        return "Car Insurance Applied";
    }
}

// Bike Class
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Bike(String number, double rate, String policy) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // discount
    }

    public double calculateInsurance() {
        return 200;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Applied";
    }
}

// Truck Class
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Truck(String number, double rate, String policy) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // heavy charge
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Applied";
    }
}

// Main
public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("UP01AB1234", 2000, "CAR123"),
            new Bike("UP02CD5678", 500, "BIKE456"),
            new Truck("UP03EF9999", 4000, "TRUCK789")
        };

        int days = 3;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType());

            double rent = v.calculateRentalCost(days);
            System.out.println("Rental Cost: " + rent);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                double insurance = ins.calculateInsurance();
                System.out.println("Insurance: " + insurance);
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println("----------------------");
        }
    }
}
