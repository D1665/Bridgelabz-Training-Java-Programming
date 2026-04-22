package Object_Oriented_Programming.OOPs_Intermediate.Projects;


import java.util.*;

// Person class
class Person {
    String name;
    String phone;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return name + " - " + phone;
    }

    // Avoid duplicate based on phone
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;

        Person p = (Person) obj;
        return this.phone.equals(p.phone);
    }
}

// Address Book
class AddressBook {
    List<Person> list = new ArrayList<>();

    void addPerson(Person p) {
        if (!list.contains(p)) {
            list.add(p);
        } else {
            System.out.println("Duplicate entry not allowed!");
        }
    }

    void deletePerson(String phone) {
        list.removeIf(p -> p.phone.equals(phone));
    }

    void searchPerson(String name) {
        for (Person p : list) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    void sortByName() {
        list.sort(Comparator.comparing(p -> p.name));
    }

    void displayAll() {
        for (Person p : list) {
            System.out.println(p);
        }
    }
}

// Main
public class AddressBookApp {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();

        ab.addPerson(new Person("Dinesh", "111"));
        ab.addPerson(new Person("Rahul", "222"));
        ab.addPerson(new Person("Dinesh", "111")); // duplicate

        ab.displayAll();

        ab.searchPerson("Rahul");

        ab.sortByName();
        System.out.println("\nAfter Sorting:");
        ab.displayAll();
    }
}