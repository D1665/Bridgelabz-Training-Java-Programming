import java.util.Scanner;

public class ShortLong {

    static int getLen(String s) {
        int c = 0;
        for (char ch : s.toCharArray()) c++;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        int min = 0, max = 0;

        for (int i = 1; i < arr.length; i++) {
            if (getLen(arr[i]) < getLen(arr[min])) min = i;
            if (getLen(arr[i]) > getLen(arr[max])) max = i;
        }

        System.out.println("Shortest: " + arr[min]);
        System.out.println("Longest: " + arr[max]);
    }
}