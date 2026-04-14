import java.util.Scanner;

public class BMIProgram {

    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    static String[][] compute(double[][] data) {
        String[][] res = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;

            double bmi = weight / (heightM * heightM);

            res[i][0] = String.valueOf(data[i][1]);
            res[i][1] = String.valueOf(weight);
            res[i][2] = String.valueOf(bmi);
            res[i][3] = getStatus(bmi);
        }
        return res;
    }

    static void display(String[][] arr) {
        System.out.println("Height  Weight  BMI  Status");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "  " + arr[i][1] + "  " + arr[i][2] + "  " + arr[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = compute(data);
        display(result);
    }
}