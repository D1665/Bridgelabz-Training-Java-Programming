import java.util.Scanner;

public class SalaryBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        int[] years = new int[10];

        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            salary[i] = sc.nextDouble();
            years[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            double bonus;

            if (years[i] > 5)
                bonus = salary[i] * 0.05;
            else
                bonus = salary[i] * 0.02;

            totalBonus += bonus;

            double newSalary = salary[i] + bonus;

            System.out.println("Old = " + salary[i] + " Bonus = " + bonus + " New = " + newSalary);
        }

        System.out.println("Total Bonus = " + totalBonus);
    }
}