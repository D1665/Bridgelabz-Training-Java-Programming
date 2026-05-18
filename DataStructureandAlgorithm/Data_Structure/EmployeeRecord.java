package DataStructureandAlgorithm.Data_Structure;

import java.util.*;

public class EmployeeRecord {
    static class Employee {
        int id;
        String name;
        double salary;
        Employee next;

        Employee(int id, String name, double salary) {
            this.id = id; this.name = name; this.salary = salary;
        }
    }

    Employee head;

    void addEmployee(int id, String name, double salary) {
        Employee e = new Employee(id, name, salary);
        if (head == null) { head = e; return; }
        Employee temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = e;
    }

    void deleteEmployee(int id) {
        if (head == null) return;
        if (head.id == id) { head = head.next; return; }
        Employee temp = head;
        while (temp.next != null && temp.next.id != id)
            temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    void searchEmployee(int id) {
        Employee temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Found: ID=" + temp.id + " Name=" + temp.name + " Salary=" + temp.salary);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee not found.");
    }

    void display() {
        Employee temp = head;
        System.out.println("ID  | Name       | Salary");
        System.out.println("----|------------|--------");
        while (temp != null) {
            System.out.printf("%-4d| %-10s | %.2f%n", temp.id, temp.name, temp.salary);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        EmployeeRecord er = new EmployeeRecord();
        er.addEmployee(1, "Alice", 50000);
        er.addEmployee(2, "Bob", 60000);
        er.addEmployee(3, "Charlie", 55000);
        er.display();
        er.searchEmployee(2);
        er.deleteEmployee(2);
        System.out.println("After deletion:");
        er.display();
    }
}
