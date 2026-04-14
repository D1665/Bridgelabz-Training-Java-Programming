import java.util.Scanner;

public class WordLength2D {

    static int getLen(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    static String[][] convert(String[] arr) {
        String[][] res = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            res[i][0] = arr[i];
            res[i][1] = String.valueOf(getLen(arr[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        String[][] res = convert(words);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}