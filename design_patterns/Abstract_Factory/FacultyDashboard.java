package design_patterns.Abstract_Factory;

public class FacultyDashboard implements Dashboard {

    @Override
    public void showDashboard() {
        System.out.println("Faculty Dashboard Opened");
    }
}