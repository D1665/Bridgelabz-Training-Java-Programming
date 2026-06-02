package design_patterns.Abstract_Factory;

public class FacultyReport implements Report {

    @Override
    public void generateReport() {
        System.out.println("Faculty Report Generated");
    }
}
