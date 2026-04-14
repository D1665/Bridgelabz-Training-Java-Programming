import java.util.*;
public class ProfitandLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Cost Price: ");
        double costPrice = sc.nextDouble();
        
        System.out.print("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();
        
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No Profit, No Loss");
        }
        
        sc.close();
    }
}
