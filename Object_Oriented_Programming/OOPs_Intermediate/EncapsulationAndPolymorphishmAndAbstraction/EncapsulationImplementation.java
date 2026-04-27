package Object_Oriented_Programming.OOPs_Intermediate.EncapsulationAndPolymorphishmAndAbstraction;

// Encapsulation Demo Program

class Student {

    // 🔒 Private variables (Data Hiding)
    private String name;
    private int age;
    private double marks;

    // 🔷 Getter for name
    public String getName() {
        return name;
    }

    // 🔷 Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // 🔷 Getter for age
    public int getAge() {
        return age;
    }

    // 🔷 Setter with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // 🔷 Getter for marks
    public double getMarks() {
        return marks;
    }

    // 🔷 Setter with validation
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks should be between 0 and 100");
        }
    }
}

// 🔷 Main Class
public class EncapsulationImplementation {
    public static void main(String[] args) {

        Student s = new Student();

        // ❌ Direct access not allowed
        // s.age = -10;  (This will give error)

        // ✅ Access using setter methods
        s.setName("Dinesh");
        s.setAge(21);
        s.setMarks(85.5);

        // Trying invalid data
        s.setAge(-5);        // will show error
        s.setMarks(150);     // will show error

        // ✅ Access using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Marks: " + s.getMarks());
    }
}
