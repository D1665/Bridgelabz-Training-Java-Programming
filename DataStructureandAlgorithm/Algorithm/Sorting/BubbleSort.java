package DataStructureandAlgorithm.Algorithm.Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // optimization
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Before: " + Arrays.toString(arr));
        long start = System.nanoTime();
        bubbleSort(arr);
        long end = System.nanoTime();
        System.out.println("After:  " + Arrays.toString(arr));
        System.out.println("Time: " + (end - start) + " ns");
    }
}
