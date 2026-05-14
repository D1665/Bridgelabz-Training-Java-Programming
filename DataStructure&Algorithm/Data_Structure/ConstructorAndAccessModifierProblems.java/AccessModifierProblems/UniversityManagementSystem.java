public class UniversityManagementSystem {

    // Student class
    static class Student {

        // Public variable
        public int rollNumber;

        // Protected variable
        protected String name;

        // Private variable
        private double CGPA;

        // Constructor
        Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        // Getter for CGPA
        public double getCGPA() {
            return CGPA;
        }

        // Setter for CGPA
        public void setCGPA(double CGPA) {
            if (CGPA >= 0.0 && CGPA <= 10.0) {
                this.CGPA = CGPA;
            } else {
                System.out.println("Invalid CGPA!");
            }
        }

        // Display method
        public void displayDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + CGPA);
        }
    }

    // Subclass
    static class PostgraduateStudent extends Student {

        String specialization;

        // Constructor
        PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
            super(rollNumber, name, CGPA);
            this.specialization = specialization;
        }

        // Method to show protected access
        public void displayPostgraduateDetails() {
            System.out.println("Roll Number: " + rollNumber); // public
            System.out.println("Name: " + name); // protected
            System.out.println("Specialization: " + specialization);
            System.out.println("CGPA: " + getCGPA()); // private via getter
        }
    }

    // Main method
    public static void main(String[] args) {

        // Student object
        Student s1 = new Student(101, "Dinesh", 8.5);
        s1.displayDetails();

        // Modify CGPA
        s1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        System.out.println("\n--- Postgraduate Student ---");

        // PostgraduateStudent object
        PostgraduateStudent pg = new PostgraduateStudent(201, "Rahul", 8.8, "Computer Science");
        pg.displayPostgraduateDetails();
    }
}