import java.util.*;
public class DiscountOnUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price per unit: ");
        double pricePerUnit = sc.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();
        
        double discountAmount = pricePerUnit * discountPercentage / 100;
        double finalPrice = pricePerUnit - discountAmount;
        
        System.out.println("Final price after discount is: " + finalPrice);
    }
}
