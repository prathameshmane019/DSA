package Sorting;

// Time Complexity : O(n^2)

public class BubbleSort {
    
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        System.out.println("Before Sorting");
        for (int e : arr)
            System.out.print(e + " ");

          System.out.println();
        System.out.println("-----------------------------");


        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;                  }
            }
            for(int e : arr)
            System.out.print(e+" ");
            System.out.println();
        }

        System.out.println("-----------------------------");
      
        System.out.println("After Sorting");
        for (int e : arr)
            System.out.print(e + " ");

        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {9,8,7,6,5,4 };
        int[] res = bs.bubbleSort(arr);

     

    }

}
