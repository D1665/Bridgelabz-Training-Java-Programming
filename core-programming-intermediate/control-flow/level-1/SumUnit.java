import java.util.*;
class SumCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n > 0) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int sumFormula = n * (n + 1) / 2;

            System.out.println(sum);
            System.out.println(sumFormula);
        }
    }
}