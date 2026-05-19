package DataStructureandAlgorithm.project;

public class CircularPassengerList {

    class Node {
        String name;
        Node next;

        Node(String name) {
            this.name = name;
        }
    }

    Node head = null;
    Node tail = null;

    // Add Passenger
    public void addPassenger(String name) {

        Node newNode = new Node(name);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        System.out.println("Passenger added to circular route.");
    }

    // Remove Passenger
    public void removePassenger(String name) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        Node previous = tail;

        do {

            if (current.name.equals(name)) {

                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }

                if (current == tail) {
                    tail = previous;
                    tail.next = head;
                }

                System.out.println("Passenger removed.");
                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println("Passenger not found.");
    }

    // Display Circular List
    public void displayPassengers() {

        if (head == null) {
            System.out.println("No passengers.");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to Start)");
    }
}