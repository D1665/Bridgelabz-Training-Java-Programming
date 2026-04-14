public class RandomStats {

    static int[] generate(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }

        return arr;
    }

    static double[] stats(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        double sum = 0;

        for (int x : arr) {
            sum += x;

            if (x < min) min = x;
            if (x > max) max = x;
        }

        double avg = sum / arr.length;

        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {

        int[] arr = generate(5);

        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        double[] res = stats(arr);

        System.out.println("Average = " + res[0]);
        System.out.println("Min = " + (int)res[1]);
        System.out.println("Max = " + (int)res[2]);
    }
}