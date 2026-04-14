
public class Factorialfor {
    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        int factorial = 1; // Initialize factorial to 1

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by the current number
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
