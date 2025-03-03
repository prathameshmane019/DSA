public class ArrayPartition {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] res= new int[nums.length];
        int pivCount=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                res[j++]=nums[i];
            }
            if(nums[i]==pivot){
                pivCount++;
            }
        }
 
        while(pivCount>0){
            res[j++]=pivot;
            pivCount--;
        }
        

        for(int k=0;k<nums.length;k++){
            if (nums[k]>pivot){ 
                res[j++]=nums[k];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayPartition arrayPartition = new ArrayPartition();
        int[] nums = {9, 12, 3, 5, 14, 10, 10};
        int pivot = 10;
        int[] res = arrayPartition.pivotArray(nums, pivot);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
