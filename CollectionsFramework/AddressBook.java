package CollectionsFramework;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class AddressBook {

    static final String FILE = "addressbook.txt";

    static class Contact {
        String name, phone, email;

        Contact(String name, String phone, String email) {
            this.name = name; this.phone = phone; this.email = email;
        }

        // Serialize to file line
        String toLine() { return name + "," + phone + "," + email; }

        // Deserialize from file line
        static Contact fromLine(String line) {
            String[] parts = line.split(",", 3);
            return parts.length == 3 ? new Contact(parts[0], parts[1], parts[2]) : null;
        }

        @Override
        public String toString() {
            return "Name: " + name + " | Phone: " + phone + " | Email: " + email;
        }
    }

    // STORE: Add a contact
    static void addContact(Contact c) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE, true))) {
            bw.write(c.toLine());
            bw.newLine();
            System.out.println("Saved: " + c.name);
        }
    }

    // RETRIEVE: Read all contacts
    static List<Contact> readAll() throws IOException {
        List<Contact> list = new ArrayList<>();
        File f = new File(FILE);
        if (!f.exists()) return list;
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            list = br.lines()
                     .filter(line -> !line.trim().isEmpty())
                     .map(Contact::fromLine)
                     .filter(Objects::nonNull)
                     .collect(Collectors.toList());
        }
        return list;
    }

    // RETRIEVE: Search by name
    static void searchByName(String name) throws IOException {
        List<Contact> results = readAll().stream()
            .filter(c -> c.name.equalsIgnoreCase(name))
            .collect(Collectors.toList());
        if (results.isEmpty()) System.out.println("No contact found: " + name);
        else results.forEach(c -> System.out.println("Found -> " + c));
    }

    // MODIFY: Update phone/email by name
    static void modifyContact(String name, String newPhone, String newEmail) throws IOException {
        List<Contact> contacts = readAll();
        boolean found = false;
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                c.phone = newPhone;
                c.email = newEmail;
                found = true;
                break;
            }
        }
        if (!found) { System.out.println("Contact not found: " + name); return; }
        writeAll(contacts);
        System.out.println("Updated: " + name);
    }

    // DELETE: Remove contact by name
    static void deleteContact(String name) throws IOException {
        List<Contact> contacts = readAll();
        int before = contacts.size();
        contacts.removeIf(c -> c.name.equalsIgnoreCase(name));
        if (contacts.size() == before) { System.out.println("Not found: " + name); return; }
        writeAll(contacts);
        System.out.println("Deleted: " + name);
    }

    // Write full list back to file (overwrite)
    static void writeAll(List<Contact> contacts) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE, false))) {
            for (Contact c : contacts) { bw.write(c.toLine()); bw.newLine(); }
        }
    }

    static void displayAll() throws IOException {
        List<Contact> contacts = readAll();
        System.out.println("\n--- Address Book (" + contacts.size() + " contacts) ---");
        if (contacts.isEmpty()) System.out.println("  (empty)");
        else contacts.forEach(c -> System.out.println("  " + c));
        System.out.println("------------------------------");
    }

    public static void main(String[] args) throws IOException {
        // Clean start
        new File(FILE).delete();

        // STORE
        System.out.println("=== STORE ===");
        addContact(new Contact("Alice", "9876543210", "alice@email.com"));
        addContact(new Contact("Bob", "8765432109", "bob@email.com"));
        addContact(new Contact("Charlie", "7654321098", "charlie@email.com"));

        // RETRIEVE
        System.out.println("\n=== RETRIEVE ALL ===");
        displayAll();

        System.out.println("=== SEARCH ===");
        searchByName("Bob");
        searchByName("Zara");

        // MODIFY
        System.out.println("\n=== MODIFY ===");
        modifyContact("Bob", "1111111111", "bob_new@email.com");
        displayAll();

        // DELETE
        System.out.println("=== DELETE ===");
        deleteContact("Charlie");
        displayAll();
    }
}
