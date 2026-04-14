import java.util.Scanner;

public class MinMax {

    static int[] find(int a, int b, int c) {
        int min = a;
        int max = a;

        if (b < min) min = b;
        if (c < min) min = c;

        if (b > max) max = b;
        if (c > max) max = c;

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] res = find(a, b, c);

        System.out.println("Smallest = " + res[0]);
        System.out.println("Largest = " + res[1]);
    }
}