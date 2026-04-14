
public class largestnum {
    public static void main(String[] args) {
        int num1 = 10; // Example number 1
        int num2 = 20; // Example number 2
        int num3 = 15; // Example number 3

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);
    }
}
