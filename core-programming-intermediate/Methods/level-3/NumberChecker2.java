import java.util.Scanner;

public class NumberChecker2 {

    static int count(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    static int[] digits(int n, int c) {
        int[] d = new int[c];

        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static int sum(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    static double squareSum(int[] d) {
        double s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    static boolean harshad(int n, int[] d) {
        return n % sum(d) == 0;
    }

    static int[][] freq(int[] d) {
        int[] f = new int[10];

        for (int x : d) f[x]++;

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (f[i] > 0) count++;
        }

        int[][] res = new int[count][2];
        int k = 0;

        for (int i = 0; i < 10; i++) {
            if (f[i] > 0) {
                res[k][0] = i;
                res[k][1] = f[i];
                k++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] d = digits(n, count(n));

        System.out.println("Sum = " + sum(d));
        System.out.println("Square Sum = " + squareSum(d));
        System.out.println("Harshad = " + harshad(n, d));

        int[][] f = freq(d);

        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i][0] + " -> " + f[i][1]);
        }
    }
}