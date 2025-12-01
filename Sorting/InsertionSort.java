package Sorting;

public class InsertionSort {

    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        int temp; 
        int small=0;
        System.out.println("Before Sorting");
        for (int e : arr)
            System.out.print(e + " ");

        System.out.println();
        System.out.println("-----------------------------");

        for (int i = 0; i < n - 1; i++) { 
            small = i; 
            for (int j = i+1; j < arr.length - i  ; j++) {
                
                if (arr[small] > arr[j]) {
                    small = j;
                } 
               
                
            }
            temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp; 
                for (int e : arr)
                    System.out.print(e + " ");

                System.out.println("Small : "+ small );
        }
        System.out.println("-----------------------------");

        System.out.println("After Sorting");
        for (int e : arr)
            System.out.print(e + " ");
        return arr;
    }

    public static void main(String[] args) {
        InsertionSort bs = new InsertionSort();
        int[] arr = { 9,  5,8, 7, 6, 4 };
        int[] res = bs.insertionSort(arr);

    }

}
