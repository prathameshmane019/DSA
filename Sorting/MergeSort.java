package Sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 9, 5, 8, 7, 6, 4 };
        System.out.println("Before Sorting");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
        System.out.println("-----------------------------");
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting");
        for (int e : arr)
            System.out.print(e + " ");
    }

    private static void mergeSort(int[] arr, int i, int j) {
        int mid = (i + j) / 2;
        if (i < j) {
            mergeSort(arr, i, mid);
            mergeSort(arr, mid + 1, j);
            merge(arr, i, mid, j);
        }

    }

    private static void merge(int[] arr, int l, int mid, int h) {
        int n1 = mid - l + 1;
        int n2 = h - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int k = 0; k < n1; k++) {
            left[k] = arr[l + k];
        }

        for (int k = 0; k < n2; k++) {
            right[k] = arr[mid + 1 + k];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;

        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
