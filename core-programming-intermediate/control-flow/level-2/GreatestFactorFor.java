
public class GreatestFactorFor {
        public static void main(String[] args) {
            int number = 28; // Example number to find the greatest factor of
            int greatestFactor = 1; // Initialize greatest factor to 1

            for (int i = 2; i <= number / 2; i++) { // Check factors from 2 to number/2
                if (number % i == 0) { // Check if 'i' is a factor of 'number'
                    greatestFactor = i; // Update greatest factor
                }
            }

            System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
        }
}
