class Course {

    // Instance variables
    String courseName;
    int duration; // in months
    double fee;

    // Class variable (static)
    static String instituteName = "ABC Institute";

    // Constructor using 'this'
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("---------------------------");
    }

    // Class method (static)
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

// Main class
public class OnlineCourseManagementSystem {
    public static void main(String[] args) {

        // Creating objects
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Web Development", 4, 12000);

        // Display details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("XYZ Institute");

        System.out.println("After updating institute name:\n");

        // Display again
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}