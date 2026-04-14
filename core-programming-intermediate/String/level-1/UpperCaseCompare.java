import java.util.Scanner;

public class UpperCaseCompare {

    public static String toUpperCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String custom = toUpperCustom(text);
        String builtIn = text.toUpperCase();

        boolean result = compareStrings(custom, builtIn);

        System.out.println("Custom Uppercase: " + custom);
        System.out.println("Built-in Uppercase: " + builtIn);
        System.out.println("Are both equal? " + result);

        sc.close();
    }
}