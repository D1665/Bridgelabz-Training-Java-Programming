public class DividePensAmongtheStudents {
    public static void main(String[] args) {
        int totalPens = 100; // Total number of pens
        int students = 4; // Number of students

        int pensPerStudent = totalPens / students; // Pens each student gets
        int remainingPens = totalPens % students; // Remaining pens after distribution

        System.out.println("Each student gets " + pensPerStudent + " pens.");
        System.out.println("Remaining pens after distribution: " + remainingPens);
    }
}
