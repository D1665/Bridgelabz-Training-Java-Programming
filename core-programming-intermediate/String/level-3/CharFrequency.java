import java.util.Scanner;

public class CharFrequency {

    static String[][] freq(String s) {
        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        int size = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) size++;
        }

        String[][] res = new String[size][2];
        int k = 0;

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                res[k][0] = String.valueOf((char)i);
                res[k][1] = String.valueOf(count[i]);
                k++;
            }
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