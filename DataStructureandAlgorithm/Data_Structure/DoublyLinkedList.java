package DataStructureandAlgorithm.Data_Structure;

public class DoublyLinkedList {
    static class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; prev = null; next = null; }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void delete(int key) {
        Node temp = head;
        while (temp != null && temp.data != key) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1); list.insert(2); list.insert(3);
        list.display();
        list.delete(2);
        list.display();
    }
}