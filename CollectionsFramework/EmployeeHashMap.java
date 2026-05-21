package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

    static class Employee {
        int id;
        String name;
        String department;

        Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return "ID: " + id + " | Name: " + name + " | Dept: " + department;
        }
    }

    HashMap<Integer, Employee> map = new HashMap<>();

    void addEmployee(int id, String name, String dept) {
        map.put(id, new Employee(id, name, dept));
        System.out.println("Added: " + name);
    }

    void searchById(int id) {
        if (map.containsKey(id))
            System.out.println("Found -> " + map.get(id));
        else
            System.out.println("No employee with ID " + id);
    }

    void deleteEmployee(int id) {
        if (map.remove(id) != null)
            System.out.println("Deleted employee ID: " + id);
        else
            System.out.println("Employee not found.");
    }

    void displayAll() {
        System.out.println("\n--- All Employees ---");
        for (Map.Entry<Integer, Employee> e : map.entrySet())
            System.out.println(e.getValue());
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        EmployeeHashMap em = new EmployeeHashMap();
        em.addEmployee(101, "Alice", "Engineering");
        em.addEmployee(102, "Bob", "Marketing");
        em.addEmployee(103, "Charlie", "HR");
        em.displayAll();

        System.out.println("\nSearching ID 102:");
        em.searchById(102);

        System.out.println("\nSearching ID 999:");
        em.searchById(999);

        System.out.println("\nDeleting ID 101:");
        em.deleteEmployee(101);
        em.displayAll();
    }
}
