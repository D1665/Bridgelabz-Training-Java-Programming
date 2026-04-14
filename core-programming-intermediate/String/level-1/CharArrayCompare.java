import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] customArray = getChars(str);
        char[] builtInArray = str.toCharArray();

        boolean result = compareArrays(customArray, builtInArray);

        System.out.print("Custom Method Output: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in Method Output: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal? " + result);

        sc.close();
    }
}