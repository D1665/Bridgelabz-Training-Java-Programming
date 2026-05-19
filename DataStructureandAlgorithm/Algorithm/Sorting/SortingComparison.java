package DataStructureandAlgorithm.Algorithm.Sorting;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = t;
                }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m); mergeSort(arr, m + 1, r);
            int n1 = m-l+1, n2 = r-m;
            int[] L = Arrays.copyOfRange(arr, l, m+1);
            int[] R = Arrays.copyOfRange(arr, m+1, r+1);
            int i = 0, j = 0, k = l;
            while (i < n1 && j < n2) arr[k++] = L[i] <= R[j] ? L[i++] : R[j++];
            while (i < n1) arr[k++] = L[i++];
            while (j < n2) arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {
        int[] sizes = {500, 1000, 5000};
        Random rng = new Random(42);

        System.out.printf("%-12s %-15s %-15s %-15s%n", "Size", "BubbleSort(ns)", "InsertionSort(ns)", "MergeSort(ns)");
        System.out.println("-".repeat(60));

        for (int n : sizes) {
            int[] base = new int[n];
            for (int i = 0; i < n; i++) base[i] = rng.nextInt(10000);

            int[] a = base.clone(), b = base.clone(), c = base.clone();

            long t1 = System.nanoTime(); bubbleSort(a); long t1e = System.nanoTime();
            long t2 = System.nanoTime(); insertionSort(b); long t2e = System.nanoTime();
            long t3 = System.nanoTime(); mergeSort(c, 0, n-1); long t3e = System.nanoTime();

            System.out.printf("%-12d %-15d %-15d %-15d%n",
                n, (t1e-t1), (t2e-t2), (t3e-t3));
        }

        System.out.println("\nComplexity Summary:");
        System.out.println("Bubble Sort   - Best: O(n), Avg: O(n^2), Worst: O(n^2), Space: O(1)");
        System.out.println("Insertion Sort- Best: O(n), Avg: O(n^2), Worst: O(n^2), Space: O(1)");
        System.out.println("Merge Sort    - Best: O(nlogn), Avg: O(nlogn), Worst: O(nlogn), Space: O(n)");
    }
}
