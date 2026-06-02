package design_patterns.Abstract_Factory;

public class FacultyFactory implements PortalFactory {

    @Override
    public User createUser() {
        return new Faculty();
    }

    @Override
    public Dashboard createDashboard() {
        return new FacultyDashboard();
    }

    @Override
    public Report createReport() {
        return new FacultyReport();
    }
}
