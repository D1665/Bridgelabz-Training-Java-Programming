import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Array is full (max 10 elements).");
                break;
            }

            arr[index] = num;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += arr[i];
        }

        System.out.println("Entered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTotal Sum = " + total);

        sc.close();
    }
}