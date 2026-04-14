import java.util.Scanner;

public class QuotientRemainder {

    static int[] find(int n, int d) {
        int q = n / d;
        int r = n % d;

        return new int[]{q, r};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] res = find(n, d);

        System.out.println("Quotient = " + res[0]);
        System.out.println("Remainder = " + res[1]);
    }
}