package Object_Oriented_Programming.OOPs_Intermediate.Projects;

class Employee {
    String name;
    int wagePerHour;
    int workingHours;

    Employee(String name, int wagePerHour, int workingHours) {
        this.name = name;
        this.wagePerHour = wagePerHour;
        this.workingHours = workingHours;
    }

    int calculateSalary() {
        return wagePerHour * workingHours;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Main
public class EmployeeWageApp {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Dinesh", 100, 40);
        emp1.display();
    }
}
