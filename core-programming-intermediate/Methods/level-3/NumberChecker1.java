import java.util.Scanner;

public class NumberChecker1 {

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

    static boolean duck(int[] d) {
        for (int x : d) {
            if (x == 0) return true;
        }
        return false;
    }

    static boolean armstrong(int n, int[] d) {
        int sum = 0;

        for (int x : d) {
            sum += Math.pow(x, d.length);
        }

        return sum == n;
    }

    static int[] largest(int[] d) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : d) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }

        return new int[]{max, second};
    }

    static int[] smallest(int[] d) {
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int x : d) {
            if (x < min) {
                second = min;
                min = x;
            } else if (x < second && x != min) {
                second = x;
            }
        }

        return new int[]{min, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int c = count(n);
        int[] d = digits(n, c);

        System.out.println("Duck = " + duck(d));
        System.out.println("Armstrong = " + armstrong(n, d));

        int[] max = largest(d);
        int[] min = smallest(d);

        System.out.println("Largest = " + max[0] + " Second = " + max[1]);
        System.out.println("Smallest = " + min[0] + " Second = " + min[1]);
    }
}