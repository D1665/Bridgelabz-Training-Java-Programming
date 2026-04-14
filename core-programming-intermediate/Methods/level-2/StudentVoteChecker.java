import java.util.Scanner;

public class StudentVoteChecker {

    static boolean canStudentVote(int age) {
        if (age < 0) return false;
        if (age >= 18) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (canStudentVote(age[i]))
                System.out.println(age[i] + " -> Can Vote");
            else
                System.out.println(age[i] + " -> Cannot Vote");
        }
    }
}