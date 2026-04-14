import java.util.*;
class SumBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        while (true) { 
            System.out.print("Enter Value: ");
            double value = sc.nextDouble();

            if(value <= 0) {
                break;
            }
            total += value;
        }
        System.out.println(total);
    }
}