import java.util.*;
 class FeetToYardandMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3; // 1 yard = 3 feet
        double miles = feet / 5280; // 1 mile = 5280 feet

        System.out.println(feet + " feet is equal to " + yards + " yards.");
        System.out.println(feet + " feet is equal to " + miles + " miles.");

        sc.close();
    }
}