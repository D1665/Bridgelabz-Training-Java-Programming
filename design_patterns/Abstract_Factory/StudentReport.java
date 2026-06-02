package design_patterns.Abstract_Factory;

public class StudentReport implements Report {

    @Override
    public void generateReport() {
        System.out.println("Student Report Generated");
    }
}