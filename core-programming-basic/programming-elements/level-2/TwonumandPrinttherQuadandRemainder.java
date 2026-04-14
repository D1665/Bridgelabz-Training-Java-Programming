import java.util.*;
public class TwonumandPrinttherQuadandRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int quad=num1*num1;
        int remainder=num1%num2;
        System.out.println("Quad of first number is:"+quad);
        System.out.println("Remainder when first number is divided by second number is:"+remainder);
    }
}
