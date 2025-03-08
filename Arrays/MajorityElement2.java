// 229. Majority Element II
// Medium
// Topics
// Companies
// Hint
// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]
 

// Constraints:

// 1 <= nums.length <= 5 * 104
// -109 <= nums[i] <= 109

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    
    public List<Integer> majorityElement(int[] nums) { 
        Map <Integer,Integer> hm = new HashMap<>();
        List<Integer> ls = new ArrayList<>();

        int threshold = nums.length/3;

        for (int i = 0; i < nums.length; i++) { 
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            
            // Check if the element count is greater than the threshold
            if (count > threshold) {
                ls.add(element);
            }
        }
        System.out.println(hm);
        return ls; 
        }  

    public static void main(String[] args) {
        MajorityElement2 me = new MajorityElement2();
        int[] nums ={1,3,4,5,3,2};
        System.out.print(me.majorityElement(nums));
    }
}
