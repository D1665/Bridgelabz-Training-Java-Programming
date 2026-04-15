import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int)(Math.random() * 100);
        int guess = 0;
        int count = 0;
        System.out.println("Guess the number between 1 and 100");

        while (guess != number) {
            guess = sc.nextInt();
            count++;

            if(guess < 1 || guess > 100)
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            
            else if (guess < number)
                System.out.println("Your Guessing num is smaller than the number so try again");
            else if (guess > number)
                System.out.println("Your Guessing num is greater than the number so try again");
            else
                System.out.println("Correct in " + count + " attempts");
        }
    }
}