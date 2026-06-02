package design_patterns.Abstract_Factory;

public class StudentDashboard implements Dashboard {

    @Override
    public void showDashboard() {
        System.out.println("Student Dashboard Opened");
    }
}