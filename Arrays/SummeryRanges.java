// 228. Summary Ranges
// Easy
// Topics
// Companies
// You are given a sorted unique integer array nums.

// A range [a,b] is the set of all integers from a to b (inclusive).

// Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

// Each range [a,b] in the list should be output as:

// "a->b" if a != b
// "a" if a == b

// Example 1:

// Input: nums = [0,1,2,4,5,7]
// Output: ["0->2","4->5","7"]
// Explanation: The ranges are:
// [0,2] --> "0->2"
// [4,5] --> "4->5"
// [7,7] --> "7"
// Example 2:

// Input: nums = [0,2,3,4,6,8,9]
// Output: ["0","2->4","6","8->9"]
// Explanation: The ranges are:
// [0,0] --> "0"
// [2,4] --> "2->4"
// [6,6] --> "6"
// [8,9] --> "8->9"

// Constraints:

// 0 <= nums.length <= 20
// -231 <= nums[i] <= 231 - 1
// All the values of nums are unique.
// nums is sorted in ascending order.

import java.util.ArrayList;
import java.util.List;

public class SummeryRanges {
    public List<String> summaryRanges(int[] nums) {
        int j = 0; // Initialize the start of the range
        int i = 0; // Initialize the end of the range
        List<String> result = new ArrayList<>(); // List to store the result

        while (i < nums.length) {
            // Expand the range while the next number is consecutive
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            // If the range contains only one number
            if (i == j) {
                result.add(nums[i] + "");
            } else {
                // If the range contains more than one number
                result.add(nums[j] + "->" + nums[i]);
            }
            i++; // Move to the next number
            j = i; // Update the start of the next range
        }
        return result; // Return the list of ranges
    }

    public static void main(String[] args) {
        SummeryRanges summeryRanges = new SummeryRanges();
        
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summeryRanges.summaryRanges(nums)); // Test the method with an example input
    }
}

