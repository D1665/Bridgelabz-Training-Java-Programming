package DataStructureandAlgorithm.project;

import java.util.ArrayList;

public class PassengerManager {

    ArrayList<Passenger> passengers = new ArrayList<>();

    // Add Passenger
    public void addPassenger(Passenger p) {

        for (Passenger passenger : passengers) {
            if (passenger.getPassengerId() == p.getPassengerId()) {
                System.out.println("Passenger ID already exists.");
                return;
            }
        }

        if (p.getName().isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        if (p.getWalletBalance() < 0) {
            System.out.println("Wallet balance cannot be negative.");
            return;
        }

        passengers.add(p);
        System.out.println("Passenger added successfully.");
    }

    // Remove Passenger
    public void removePassenger(int id) {

        for (Passenger p : passengers) {
            if (p.getPassengerId() == id) {
                passengers.remove(p);
                System.out.println("Passenger removed.");
                return;
            }
        }

        System.out.println("Passenger not found.");
    }

    // Search Passenger
    public Passenger searchPassenger(int id) {

        for (Passenger p : passengers) {
            if (p.getPassengerId() == id) {
                return p;
            }
        }

        return null;
    }

    // Display All
    public void displayPassengers() {

        if (passengers.isEmpty()) {
            System.out.println("No passengers available.");
            return;
        }

        for (Passenger p : passengers) {
            System.out.println(p);
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}