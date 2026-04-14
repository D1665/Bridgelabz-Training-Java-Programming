import java.util.Scanner;

public class RPSGame {

    static String getComputerChoice() {
        int r = (int)(Math.random() * 3);

        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static String winner(String user, String comp) {

        if (user.equals(comp)) return "draw";

        if (user.equals("rock") && comp.equals("scissors")) return "user";
        if (user.equals("paper") && comp.equals("rock")) return "user";
        if (user.equals("scissors") && comp.equals("paper")) return "user";

        return "comp";
    }

    static void stats(int userWin, int compWin, int total) {
        double userPer = (userWin * 100.0) / total;
        double compPer = (compWin * 100.0) / total;

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWin);
        System.out.println("Computer Wins: " + compWin);
        System.out.println("User %: " + userPer);
        System.out.println("Computer %: " + compPer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWin = 0, compWin = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();

            String comp = getComputerChoice();

            String res = winner(user, comp);

            System.out.println("Computer: " + comp);

            if (res.equals("user")) {
                System.out.println("User wins");
                userWin++;
            } else if (res.equals("comp")) {
                System.out.println("Computer wins");
                compWin++;
            } else {
                System.out.println("Draw");
            }
        }

        stats(userWin, compWin, n);
    }
}