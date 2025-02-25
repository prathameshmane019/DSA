// 219. Contains Duplicate II
// Easy
// Topics
// Companies
// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109
// 0 <= k <= 105

import java.util.HashMap;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                int index = mp.get(nums[i]);
                if (k >= i - index) {
                    return true;
                }
            }
            mp.put(nums[i], i);
        }
        return false;
    }
    
    public static void main(String[] args) {
         
            int[] nums = {1, 0, 1, 1};
            // Test the method with an example input  
            System.out.println(containsNearbyDuplicate(nums, 1)); // Output: true
        
    }
    
   
}

