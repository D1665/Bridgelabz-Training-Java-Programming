import java.util.Scanner;

public class Voting {

    static int[] getAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    static String[][] checkVote(int[] ages) {
        String[][] res = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) res[i][1] = "true";
            else res[i][1] = "false";
        }
        return res;
    }

    static void display(String[][] arr) {
        System.out.println("Age   CanVote");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "     " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = getAges(10);
        String[][] res = checkVote(ages);
        display(res);
    }
}