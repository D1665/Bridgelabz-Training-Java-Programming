import java.util.*;
public class CentimeterToFeetandInches {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in centimeters: ");
        double centimeters = sc.nextDouble();

        double inches = centimeters / 2.54; // 1 inch = 2.54 cm
        double feet = inches / 12; // 1 foot = 12 inches

        System.out.println(centimeters + " centimeters is equal to " + feet + " feet and " + (inches % 12) + " inches.");

        sc.close();
    }

}
