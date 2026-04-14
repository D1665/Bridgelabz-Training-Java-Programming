import java.util.Scanner;

public class SumCompare {

    static int rec(int n) {
        if (n == 1) return 1;
        return n + rec(n - 1);
    }

    static int formula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int r1 = rec(n);
        int r2 = formula(n);

        System.out.println("Recursive = " + r1);
        System.out.println("Formula = " + r2);

        if (r1 == r2) System.out.println("Both are same");
    }
}