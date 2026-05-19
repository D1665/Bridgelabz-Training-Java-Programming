package DataStructureandAlgorithm.Algorithm.Sorting;

import java.util.Arrays;

public class MergeSort {
    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2)
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Before: " + Arrays.toString(arr));
        long start = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();
        System.out.println("After:  " + Arrays.toString(arr));
        System.out.println("Time: " + (end - start) + " ns");
    }
}
