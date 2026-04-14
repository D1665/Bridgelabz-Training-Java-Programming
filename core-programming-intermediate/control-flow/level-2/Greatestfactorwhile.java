
public class Greatestfactorwhile {
    public static void main(String[] args) {
        int number = 28; // Example number to find the greatest factor of
        int greatestFactor = 1; // Initialize greatest factor to 1
        int i = 2; // Start checking from 2

        while (i <= number / 2) { // Check factors from 2 to number/2
            if (number % i == 0) { // Check if 'i' is a factor of 'number'
                greatestFactor = i; // Update greatest factor
            }
            i++; // Move to the next number
        }

        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
    }
}
