import java.util.Scanner;

public class Factors {

    static int[] getFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] arr = new int[count];
        int k = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[k++] = i;
            }
        }

        return arr;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static int product(int[] arr) {
        int p = 1;
        for (int x : arr) p *= x;
        return p;
    }

    static double squareSum(int[] arr) {
        double s = 0;
        for (int x : arr) {
            s += Math.pow(x, 2);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] f = getFactors(n);

        for (int x : f) System.out.print(x + " ");
        System.out.println();

        System.out.println("Sum = " + sum(f));
        System.out.println("Product = " + product(f));
        System.out.println("Square Sum = " + squareSum(f));
    }
}