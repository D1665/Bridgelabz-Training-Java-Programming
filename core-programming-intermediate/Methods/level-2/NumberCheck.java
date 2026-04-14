import java.util.Scanner;

public class NumberCheck {

    static boolean isPositive(int n) {
        return n >= 0;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(arr[i])) {
                if (isEven(arr[i]))
                    System.out.println(arr[i] + " Positive Even");
                else
                    System.out.println(arr[i] + " Positive Odd");
            } else {
                System.out.println(arr[i] + " Negative");
            }
        }

        int res = compare(arr[0], arr[4]);

        if (res == 1) System.out.println("First > Last");
        else if (res == 0) System.out.println("Equal");
        else System.out.println("First < Last");
    }
}