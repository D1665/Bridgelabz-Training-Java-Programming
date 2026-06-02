package design_patterns.Abstract_Factory;

public class StudentFactory implements PortalFactory {

    @Override
    public User createUser() {
        return new Student();
    }

    @Override
    public Dashboard createDashboard() {
        return new StudentDashboard();
    }

    @Override
    public Report createReport() {
        return new StudentReport();
    }
}
