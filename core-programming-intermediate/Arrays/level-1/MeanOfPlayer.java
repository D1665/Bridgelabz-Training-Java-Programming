import java.util.*;
public class MeanOfPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scores[]=new int[11];
        int sum=0;
        
        for (int score : scores) {
            sum += score; // Add each score to the sum
        }
        
        double mean = (double) sum / scores.length; // Calculate the mean
        System.out.println("The mean score of the players is: " + mean);
    }
}
