import java.util.Scanner;

public class Chocolates {

    static int[] distribute(int choco, int kids) {
        int each = choco / kids;
        int rem = choco % kids;

        return new int[]{each, rem};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int k = sc.nextInt();

        int[] res = distribute(c, k);

        System.out.println("Each gets = " + res[0]);
        System.out.println("Remaining = " + res[1]);
    }
}