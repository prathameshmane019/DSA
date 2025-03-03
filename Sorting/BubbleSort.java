package Sorting;




public class BubbleSort {
    public int[] bubbleSort(int [] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {4,1,5,2,3};
        int[] res = bs.bubbleSort(arr);

        for (int i : res) {
            System.out.print(" "+i);
        }

    }
}
