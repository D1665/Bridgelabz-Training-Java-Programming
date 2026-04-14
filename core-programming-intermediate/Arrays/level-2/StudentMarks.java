import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] marks = new double[10][3];
        int index = 0;

        while (true) {
            System.out.print("Enter Physics marks: ");
            double p = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            double c = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            double m = sc.nextDouble();

            if (p <= 0 || c <= 0 || m <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Maximum students reached.");
                break;
            }

            marks[index][0] = p;
            marks[index][1] = c;
            marks[index][2] = m;

            index++;
        }

        for (int i = 0; i < index; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = total / 3;

            String grade;

            if (percentage >= 90) grade = "A";
            else if (percentage >= 75) grade = "B";
            else if (percentage >= 50) grade = "C";
            else grade = "Fail";

            System.out.println("Student " + (i + 1) + ": Percentage = " + percentage + ", Grade = " + grade);
        }

        sc.close();
    }
}