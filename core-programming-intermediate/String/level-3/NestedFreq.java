import java.util.Scanner;

public class NestedFreq {

    static String[] freq(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[i] = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count[i]++;
                    arr[j] = '0';
                }
            }
        }

        String[] res = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '0') {
                res[i] = arr[i] + " -> " + count[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = freq(s);

        for (String x : arr) {
            if (x != null) System.out.println(x);
        }
    }
}