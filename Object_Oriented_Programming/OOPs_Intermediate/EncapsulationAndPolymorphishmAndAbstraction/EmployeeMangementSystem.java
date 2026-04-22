package Object_Oriented_Programming.OOPs_Intermediate.EncapsulationAndPolymorphishmAndAbstraction;

// Interface
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract Class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters & Setters (Encapsulation)
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract Method
    abstract double calculateSalary();

    // Concrete Method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee implements Department {
    private String department;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return getBaseSalary(); // fixed salary
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

// Main Class
public class EmployeeMangementSystem {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(101, "Dinesh", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Rahul", 500, 20);

        Department d1 = (Department) emp1;
        Department d2 = (Department) emp2;

        d1.assignDepartment("IT");
        d2.assignDepartment("Support");

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());

            Department dept = (Department) emp;
            System.out.println("Department: " + dept.getDepartmentDetails());
            System.out.println("----------------------");
        }
    }
}
