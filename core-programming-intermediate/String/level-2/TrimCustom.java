import java.util.Scanner;

public class TrimCustom {

    static int[] trimIndex(String s) {
        int start = 0, end = s.length() - 1;

        while (start < s.length() && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    static String sub(String s, int a, int b) {
        String res = "";
        for (int i = a; i <= b; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] idx = trimIndex(s);

        String a = sub(s, idx[0], idx[1]);
        String b = s.trim();

        System.out.println(a.equals(b));
    }
}