
public class Factorswhile {
    public static void main(String[] args) {
        int number = 28; // Example number to find factors of
        System.out.println("Factors of " + number + ":");
        int i = 1; // Initialize the counter
        while (i <= number) { // Loop until 'i' exceeds 'number'
            if (number % i == 0) { // Check if 'i' is a factor of 'number'
                System.out.println(i); // Print the factor
            }
            i++; // Increment the counter
        }
    }
}
