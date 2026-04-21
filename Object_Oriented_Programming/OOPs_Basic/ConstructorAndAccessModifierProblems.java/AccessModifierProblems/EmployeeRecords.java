public class EmployeeRecords {

    // Employee class
    static class Employee {

        // Public variable
        public int employeeID;

        // Protected variable
        protected String department;

        // Private variable
        private double salary;

        // Constructor
        Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        // Getter for salary
        public double getSalary() {
            return salary;
        }

        // Setter for salary
        public void setSalary(double salary) {
            if (salary > 0) {
                this.salary = salary;
            } else {
                System.out.println("Invalid salary!");
            }
        }

        // Display method
        public void displayEmployee() {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
        }
    }

    // Manager subclass
    static class Manager extends Employee {

        String role;

        // Constructor
        Manager(int employeeID, String department, double salary, String role) {
            super(employeeID, department, salary);
            this.role = role;
        }

        // Method to show access
        public void displayManagerDetails() {
            System.out.println("Employee ID: " + employeeID);   // public
            System.out.println("Department: " + department);   // protected
            System.out.println("Role: " + role);

            // Access private salary via getter
            System.out.println("Salary: " + getSalary());
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create Employee object
        Employee emp = new Employee(101, "IT", 50000);
        emp.displayEmployee();

        // Modify salary
        emp.setSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());

        System.out.println("\n--- Manager Details ---");

        // Create Manager object
        Manager mgr = new Manager(201, "HR", 80000, "Team Lead");
        mgr.displayManagerDetails();
    }
}