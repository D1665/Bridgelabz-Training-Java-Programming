import java.util.*;
public class TotalPrice{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int quantity=sc.nextInt();
    int priceperUnit=sc.nextInt();
    int totalprice=quantity*priceperUnit;
    System.out.println("Total price is:"+totalprice);
   }
}
