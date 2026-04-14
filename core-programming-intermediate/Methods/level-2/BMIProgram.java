import java.util.Scanner;

public class BMIProgram {

    static double[][] calcBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double w = data[i][0];
            double h = data[i][1] / 100;

            double bmi = w / (h * h);
            data[i][2] = bmi;
        }

        return data;
    }

    static String[] status(double[][] data) {
        String[] s = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) s[i] = "Underweight";
            else if (bmi < 25) s[i] = "Normal";
            else if (bmi < 30) s[i] = "Overweight";
            else s[i] = "Obese";
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        calcBMI(data);
        String[] s = status(data);

        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + s[i]);
        }
    }
}