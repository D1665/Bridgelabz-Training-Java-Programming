import java.util.*;
public class DiscountOnUniversityFee {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Double fee=sc.nextDouble();
        Double discount=sc.nextDouble();
        Double discountedAmount=fee*discount/100;
        Double finalFee=fee-discountedAmount;
        System.out.println("Final fee after discount is:"+finalFee);
    }
}
