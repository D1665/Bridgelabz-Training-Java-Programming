import java.util.Scanner;

public class DeckCards {

    static String[] initDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = new String[suits.length * ranks.length];

        int k = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[k++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    static void shuffle(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    static String[][] distribute(String[] deck, int players, int cards) {
        String[][] res = new String[players][cards];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                res[i][j] = deck[index++];
            }
        }

        return res;
    }

    static void print(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Player " + (i+1));

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initDeck();
        shuffle(deck);

        System.out.print("Enter players: ");
        int p = sc.nextInt();

        System.out.print("Enter cards each: ");
        int c = sc.nextInt();

        if (p * c > deck.length) {
            System.out.println("Not possible");
            return;
        }

        String[][] res = distribute(deck, p, c);
        print(res);
    }
}