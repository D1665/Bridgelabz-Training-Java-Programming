package CollectionsFramework;
public class RemoveOccurrences {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Remove all nodes with given value
    void removeAll(int value) {
        // Remove from front
        while (head != null && head.data == value)
            head = head.next;

        // Remove from rest
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.data == value)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
    }

    void display() {
        Node temp = head;
        if (temp == null) { System.out.println("List is empty"); return; }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveOccurrences list = new RemoveOccurrences();
        int[] values = {3, 1, 3, 4, 3, 5, 3};
        for (int v : values) list.insert(v);

        System.out.print("Original: ");
        list.display();

        int target = 3;
        list.removeAll(target);

        System.out.print("After removing all " + target + "s: ");
        list.display();

        // Edge case: all same
        RemoveOccurrences list2 = new RemoveOccurrences();
        for (int i = 0; i < 4; i++) list2.insert(5);
        System.out.print("\nAll 5s: ");
        list2.display();
        list2.removeAll(5);
        System.out.print("After removing all 5s: ");
        list2.display();
    }
}