package Sorting;

 
 
 
public class QuickSort { 
    private int partition(int[] arr, int low, int high) {
        int pi = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (arr[j]<pi) {
                i++;
               swap(arr, i, j); 
            }
        }
        swap(arr,i+1, high);
        return i+1;
    }
    
    public void quickSort(int[] arr,int low,int high) {
       
        if (low<high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    } 

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort bs = new QuickSort();
        int[] arr = { 9,  5,8, 7, 6, 4 };
        bs.quickSort(arr,0,arr.length-1);
        for (int e : arr)
            System.out.print(e + " "); 
    }  
} 
