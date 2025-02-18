// 55. Jump Game
// Solved
// Medium
// Topics
// Companies
// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.

 

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:

// Input: nums = [3,2,1,0,4]
// Output: false
// Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

// Constraints:

// 1 <= nums.length <= 104
// 0 <= nums[i] <= 105



class Solution1 {
    public boolean canJump(int[] nums) {
        int gas=0;

        for(int i=0;i<nums.length;i++){
            if(i>gas){
                return false;
            }
            gas = Math.max(gas, i+nums[i] );
        }
        return true;
    }
}

// 45. Jump Game II
// Medium
// Topics
// Companies
// You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

// Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

// 0 <= j <= nums[i] and
// i + j < n
// Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

 

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: 2
// Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:

// Input: nums = [2,3,0,1,4]
// Output: 2
 

// Constraints:

// 1 <= nums.length <= 104
// 0 <= nums[i] <= 1000
// It's guaranteed that you can reach nums[n - 1].

// Solution :-
// while moving from left to right the gas decreases by one and the 
// there is also gas present on each index but we have choice to
// to select the replace with maximum new gas or use existing gas

// use Math.max for selecting maximum gas from i+nums[i],curren end

class Solution2 {
    public int jump(int[] nums) {
        int jump=0;
        int currentEnd=0;
        int farthest =0;

        for (int i = 0; i < nums.length-1; i++) {
            farthest = Math.max(farthest, i+ nums[i]);
            if (i==currentEnd) {
                jump++;
                currentEnd=farthest;
            }
        }
        return jump;
    }
}


public class JumpGame {
        public static void main(String[] args) {
            int [] arr ={2,3,1,1,4};
            // Jump Game I
            Solution1 sol1 = new Solution1();
            System.out.println("Output for Jump Game I : "+ sol1.canJump(arr));

            //Jump Game II
            Solution2 sol2 = new Solution2();
            System.out.println("Output for Jump game II:"+sol2.jump(arr));
    }
}
