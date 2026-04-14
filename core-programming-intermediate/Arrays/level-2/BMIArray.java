import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            do {
                System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
                weight[i] = sc.nextDouble();
            } while (weight[i] <= 0);

            do {
                System.out.print("Enter height of person " + (i + 1) + " (m): ");
                height[i] = sc.nextDouble();
            } while (height[i] <= 0);

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 40) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nDetails:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " m");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println();
        }

        sc.close();
    }
}