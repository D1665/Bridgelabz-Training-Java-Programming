
public class Factorsfor {
    public static void main(String[] args) {
        int number = 28; // Example number to find factors of
        System.out.println("Factors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if 'i' is a factor of 'number'
                System.out.println(i); // Print the factor
            }
        }
    }
}
