// 506. Relative Ranks
// Easy
// Topics
// Companies
// You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

// The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

// The 1st place athlete's rank is "Gold Medal".
// The 2nd place athlete's rank is "Silver Medal".
// The 3rd place athlete's rank is "Bronze Medal".
// For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
// Return an array answer of size n where answer[i] is the rank of the ith athlete.

// Example 1:

// Input: score = [5,4,3,2,1]
// Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
// Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
// Example 2:

// Input: score = [10,3,8,9,4]
// Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
// Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

// Constraints:

// n == score.length
// 1 <= n <= 104
// 0 <= score[i] <= 106
// All the values in score are unique.

import java.util.Arrays;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int gold = 0;
        int silver = 0;
        int bronze = 0;
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        String[] result = new String[score.length];
        gold = sorted.length - 1;
        silver = sorted.length - 2;
        bronze = sorted.length - 3;

        for (int i = 0; i < score.length; i++) {
            if (score[i] == sorted[gold]) {
                result[i] = "Gold Medal";
            } else if (score[i] == sorted[silver]) {
                result[i] = "Silver Medal";
            } else if (score[i] == sorted[bronze]) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(score.length - Arrays.binarySearch(sorted, score[i]) );
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RelativeRanks relativeRanks = new RelativeRanks();
        int[] score = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(relativeRanks.findRelativeRanks(score)));

    }
}
// Complexity Analysis
// The time complexity for this approach is O(nlogn)O(nlogn), where nn is the length of the input array score. The time complexity is dominated by the sorting operation.
