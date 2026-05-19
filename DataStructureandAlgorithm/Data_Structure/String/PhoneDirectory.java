package DataStructureandAlgorithm.Data_Structure.String;

import java.util.HashMap;

public class PhoneDirectory {
    HashMap<String, String> directory = new HashMap<>();

    void addContact(String name, String phone) {
        directory.put(name, phone);
        System.out.println("Added: " + name + " -> " + phone);
    }

    void search(String name) {
        if (directory.containsKey(name))
            System.out.println(name + "'s number: " + directory.get(name));
        else
            System.out.println(name + " not found.");
    }

    void delete(String name) {
        if (directory.remove(name) != null)
            System.out.println("Deleted: " + name);
        else
            System.out.println("Contact not found.");
    }

    void display() {
        System.out.println("Phone Directory:");
        directory.forEach((k, v) -> System.out.println("  " + k + ": " + v));
    }

    public static void main(String[] args) {
        PhoneDirectory pd = new PhoneDirectory();
        pd.addContact("Alice", "9876543210");
        pd.addContact("Bob", "8765432109");
        pd.addContact("Charlie", "7654321098");
        pd.display();
        pd.search("Bob");
        pd.delete("Alice");
        pd.display();
    }
}
