import java.util.Scanner;

public class UniqueChars {

    static int getLen(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    static char[] unique(String s) {
        int len = getLen(s);
        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (temp[j] == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k++] = ch;
            }
        }

        char[] res = new char[k];
        for (int i = 0; i < k; i++) res[i] = temp[i];

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] arr = unique(s);

        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}