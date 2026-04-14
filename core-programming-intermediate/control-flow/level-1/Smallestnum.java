
public class Smallestnum {
    public static void main(String[] args) {
        int num1 = 10; // Example number 1
        int num2 = 20; // Example number 2
        int num3 = 5;  // Example number 3

        int smallest;

        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        System.out.println("The smallest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + smallest);
    }
}
