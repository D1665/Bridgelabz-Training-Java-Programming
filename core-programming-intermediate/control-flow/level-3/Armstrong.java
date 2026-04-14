import java.util.*;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        int sum = 0;
        int originalNumber = number;

        while(number != 0){
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
    }
}