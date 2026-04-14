import java.util.Scanner;

public class PerfectStrong {

    static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }

        return sum == n;
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += fact(d);
            n /= 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Perfect = " + isPerfect(n));
        System.out.println("Strong = " + isStrong(n));
    }
}