package Object_Oriented_Programming.OOPs_Intermediate.Projects;

import java.util.ArrayList;
import java.util.Scanner;

// Contact class
class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name: " + name + ", Phone: " + phone);
    }
}

// Main class
public class AddressBookApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add  2. View  3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter phone: ");
                String phone = sc.nextLine();

                list.add(new Contact(name, phone));
                System.out.println("Contact Added!");

            } else if (ch == 2) {
                if (list.isEmpty()) {
                    System.out.println("No contacts!");
                } else {
                    for (Contact c : list) {
                        c.display();
                    }
                }

            } else if (ch == 3) {
                System.out.println("Exit...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
