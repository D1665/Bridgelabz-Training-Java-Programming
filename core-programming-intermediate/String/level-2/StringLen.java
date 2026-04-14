import java.util.Scanner;

public class StringLen {

    static int getLen(String s) {
        int i = 0;

        while (true) {
            s.charAt(i);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String str = sc.next();

        int l1 = getLen(str);
        int l2 = str.length();

        System.out.println("my len = " + l1);
        System.out.println("actual = " + l2);
    }
}