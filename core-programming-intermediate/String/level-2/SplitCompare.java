import java.util.Scanner;

public class SplitCompare {

    static int getLen(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    static String[] splitCustom(String s) {
        int len = getLen(s);
        int words = 1;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') words++;
        }

        String[] arr = new String[words];

        int start = 0, idx = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                String temp = "";
                for (int j = start; j < i; j++) {
                    temp += s.charAt(j);
                }
                arr[idx++] = temp;
                start = i + 1;
            }
        }

        String temp = "";
        for (int i = start; i < len; i++) {
            temp += s.charAt(i);
        }
        arr[idx] = temp;

        return arr;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] a = splitCustom(text);
        String[] b = text.split(" ");

        System.out.println(compare(a, b));
    }
}