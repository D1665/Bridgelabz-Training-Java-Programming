
public class Factorialwhile {
    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        int factorial = 1; // Initialize factorial to 1
        int i = 1; // Start from 1

        while (i <= number) {
            factorial *= i; // Multiply factorial by the current number
            i++; // Increment the counter
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
