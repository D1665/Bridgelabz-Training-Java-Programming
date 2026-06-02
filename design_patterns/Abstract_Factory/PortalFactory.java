package design_patterns.Abstract_Factory;

public interface PortalFactory {

    User createUser();

    Dashboard createDashboard();

    Report createReport();
}
