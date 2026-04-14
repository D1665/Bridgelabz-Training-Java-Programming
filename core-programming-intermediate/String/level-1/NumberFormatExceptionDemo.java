import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number = " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number = " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // Uncomment to generate exception
        // generateException(text);

        handleException(text);

        sc.close();
    }
}