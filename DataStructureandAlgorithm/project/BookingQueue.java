package DataStructureandAlgorithm.project;

import java.util.LinkedList;
import java.util.Queue;

public class BookingQueue {

    Queue<String> bookingQueue = new LinkedList<>();

    // Add Booking
    public void addBooking(String passengerName) {
        bookingQueue.add(passengerName);
        System.out.println("Booking request added.");
    }

    // Process Booking
    public void processBooking() {

        if (bookingQueue.isEmpty()) {
            System.out.println("No bookings pending.");
            return;
        }

        System.out.println("Processed Booking: " + bookingQueue.poll());
    }

    // View Next Booking
    public void viewNextBooking() {

        if (bookingQueue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Next Booking: " + bookingQueue.peek());
    }

    // Display Queue
    public void displayQueue() {
        System.out.println(bookingQueue);
    }
}