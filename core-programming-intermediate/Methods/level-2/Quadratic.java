import java.util.Scanner;

public class Quadratic {

    static double[] roots(double a, double b, double c) {

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            return new double[]{r1, r2};
        }

        else if (d == 0) {
            double r = -b / (2 * a);
            return new double[]{r};
        }

        return new double[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] r = roots(a, b, c);

        if (r.length == 0) {
            System.out.println("No real roots");
        } else {
            for (double x : r) System.out.println(x);
        }
    }
}