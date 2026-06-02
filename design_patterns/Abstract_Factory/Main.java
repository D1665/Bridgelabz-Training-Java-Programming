package design_patterns.Abstract_Factory;

public class Main {

    public static void main(String[] args) {

        // Student Family

        PortalFactory studentFactory =
                new StudentFactory();

        User student =
                studentFactory.createUser();

        Dashboard studentDashboard =
                studentFactory.createDashboard();

        Report studentReport =
                studentFactory.createReport();

        student.showRole();
        studentDashboard.showDashboard();
        studentReport.generateReport();

        System.out.println("----------------");

        // Faculty Family

        PortalFactory facultyFactory =
                new FacultyFactory();

        User faculty =
                facultyFactory.createUser();

        Dashboard facultyDashboard =
                facultyFactory.createDashboard();

        Report facultyReport =
                facultyFactory.createReport();

        faculty.showRole();
        facultyDashboard.showDashboard();
        facultyReport.generateReport();
    }
}
