package Sorting;

 
 
public class SelectionSort {

    public int[] selectionSort(int[] arr) {
        int n = arr.length; 
        int j=0; 
        int key;
        System.out.println("Before Sorting");
        for (int e : arr)
            System.out.print(e + " ");

        System.out.println();
        System.out.println("-----------------------------");

        for (int i = 1; i < n ; i++) { 
             j=i-1;
             key =arr[i];
            while (j>=0 && key < arr[j]) {
                arr[j+1]= arr[j];
                j--;
            } 
            arr[j+1]=key;  
             for (int e : arr)
            System.out.print(e + " ");

            System.out.println();
        }
        System.out.println("-----------------------------");

        System.out.println("After Sorting");
        for (int e : arr)
            System.out.print(e + " ");
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort bs = new SelectionSort();
        int[] arr = { 9,  5,8, 7, 6, 4 };
        int[] res = bs.selectionSort(arr);

    }  
}
