import java.util.*;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks Of Physics: ");
        double phy = sc.nextDouble();
        System.out.print("Enter Marks Of Chemistry: ");
        double chem = sc.nextDouble();
        System.out.print("Enter Marks Of Maths: ");
        double math = sc.nextDouble();

        double avg = (phy + chem + math) / 3;
        System.out.println("Average: " + avg);

        if(avg >= 80) {
            System.out.println("Grade A");
            System.out.println("Level 4, above agency-normalized standards");
        }
        else if(avg >= 70) {
            System.out.println("Grade B");
            System.out.println("Level 3, at agency-normalized standards");
        }
        else if(avg >= 60) {
            System.out.println("Grade C");
            System.out.println("Level 2, below, but approaching agency-normalized standards");
        }
        else if(avg >= 60) {
            System.out.println("Grade C");
            System.out.println("Level 2, below, but approaching agency-normalized standards");
        }
        else if(avg >= 50) {
            System.out.println("Grade D");
            System.out.println("Level 1, well below agency-normalized standards");
        }
        else if(avg >= 40) {
            System.out.println("Grade E");
            System.out.println("Level 1-, too below agency-normalized standards");
        }
        else  {
            System.out.println("Grade R");
            System.out.println("Remedial Standards");
        }
    }
}