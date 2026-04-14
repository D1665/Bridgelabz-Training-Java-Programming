import java.util.Scanner;

public class UniqueFrequency {

    static char[] unique(String s) {
        char[] temp = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (temp[j] == s.charAt(i)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k++] = s.charAt(i);
            }
        }

        char[] res = new char[k];
        for (int i = 0; i < k; i++) res[i] = temp[i];

        return res;
    }

    static String[][] freq(String s) {
        char[] u = unique(s);
        String[][] res = new String[u.length][2];

        for (int i = 0; i < u.length; i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (u[i] == s.charAt(j)) count++;
            }

            res[i][0] = String.valueOf(u[i]);
            res[i][1] = String.valueOf(count);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[][] arr = freq(s);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " -> " + arr[i][1]);
        }
    }
}