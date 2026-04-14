import java.util.Random;

public class Football {

    static int[] generate() {
        int[] h = new int[11];
        Random r = new Random();

        for (int i = 0; i < 11; i++) {
            h[i] = 150 + r.nextInt(101);
        }
        return h;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int min(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x < m) m = x;
        return m;
    }

    static int max(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x > m) m = x;
        return m;
    }

    public static void main(String[] args) {

        int[] h = generate();

        for (int x : h) System.out.print(x + " ");
        System.out.println();

        System.out.println("Mean = " + mean(h));
        System.out.println("Shortest = " + min(h));
        System.out.println("Tallest = " + max(h));
    }
}