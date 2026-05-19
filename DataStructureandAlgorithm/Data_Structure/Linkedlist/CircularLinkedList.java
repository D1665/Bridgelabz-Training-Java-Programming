package DataStructureandAlgorithm.Data_Structure.Linkedlist;

public class CircularLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; newNode.next = head; return; }
        Node temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(10); list.insert(20); list.insert(30);
        list.display();
    }
}