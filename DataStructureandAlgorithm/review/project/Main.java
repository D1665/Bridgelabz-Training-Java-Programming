package DataStructureandAlgorithm.review.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PassengerManager manager = new PassengerManager();
        BookingQueue bookingQueue = new BookingQueue();
        StationHistory history = new StationHistory();
        TravelAnalytics analytics = new TravelAnalytics();
        CircularPassengerList circularList = new CircularPassengerList();
        SortingSearching sortSearch = new SortingSearching();

        while (true) {

            System.out.println("\n===== SMART METRO SYSTEM =====");

            System.out.println("1. Add Passenger");
            System.out.println("2. Display Passengers");
            System.out.println("3. Add Booking");
            System.out.println("4. Process Booking");
            System.out.println("5. Add Station History");
            System.out.println("6. Undo Station");
            System.out.println("7. Add Analytics");
            System.out.println("8. Display Analytics");
            System.out.println("9. Add Circular Passenger");
            System.out.println("10. Display Circular Route");
            System.out.println("11. Sort by Age");
            System.out.println("12. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Source Station: ");
                    String source = sc.nextLine();

                    System.out.print("Enter Destination Station: ");
                    String destination = sc.nextLine();

                    System.out.print("Enter Wallet Balance: ");
                    double wallet = sc.nextDouble();

                    Passenger p = new Passenger(id, name, age,
                            source, destination, wallet);

                    manager.addPassenger(p);

                    break;

                case 2:
                    manager.displayPassengers();
                    break;

                case 3:

                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String bookingName = sc.nextLine();

                    bookingQueue.addBooking(bookingName);
                    break;

                case 4:
                    bookingQueue.processBooking();
                    break;

                case 5:

                    sc.nextLine();
                    System.out.print("Enter Station Name: ");
                    String station = sc.nextLine();

                    history.addStation(station);
                    break;

                case 6:
                    history.undoStation();
                    break;

                case 7:

                    sc.nextLine();
                    System.out.print("Enter Station Name: ");
                    String stationName = sc.nextLine();

                    analytics.addStationVisit(stationName);
                    break;

                case 8:
                    analytics.displayAnalytics();
                    break;

                case 9:

                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String circularName = sc.nextLine();

                    circularList.addPassenger(circularName);
                    break;

                case 10:
                    circularList.displayPassengers();
                    break;

                case 11:

                    sortSearch.bubbleSortByAge(manager.getPassengers());
                    manager.displayPassengers();

                    break;

                case 12:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}