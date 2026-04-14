import java.util.*;
class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        if(sum > number) {
            System.out.println("Abundant Number");
        }
        else {
            System.out.println("Not a Abundant Number");
        }
    }
}