package DataStructureandAlgorithm.Data_Structure;

import java.util.LinkedList;
import java.util.Queue;

public class TicketCounter {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Customers arrive
        queue.offer("Customer1");
        queue.offer("Customer2");
        queue.offer("Customer3");
        queue.offer("Customer4");

        System.out.println("Queue: " + queue);

        // Serve customers
        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }

        System.out.println("All customers served.");
    }
}