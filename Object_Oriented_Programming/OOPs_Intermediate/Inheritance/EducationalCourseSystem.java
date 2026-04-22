package Object_Oriented_Programming.OOPs_Intermediate.Inheritance;

// Base Class
class Course {
    String courseName;
    int duration; // in hours

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Intermediate Class
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // calling parent constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayOnlineCourseInfo() {
        displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Derived Class
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayFullInfo() {
        displayOnlineCourseInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");

        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Final Price: " + finalPrice);
    }
}

// Main Class
public class EducationalCourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse(
            "Java OOP",
            40,
            "Udemy",
            true,
            5000,
            20
        );

        course.displayFullInfo();
    }
}
