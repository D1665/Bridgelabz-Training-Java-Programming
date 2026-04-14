import java.util.Scanner;

public class VowelCount {

    static boolean isVowel(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (isVowel(ch)) v++;
                else c++;
            }
        }

        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
    }
}