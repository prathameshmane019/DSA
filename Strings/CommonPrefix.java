// 14. Longest Common Prefix
// Easy
// Topics
// Companies
// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters if it is non-empty.

import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String [] arr ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));

    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < Math.min(first.length()-1, last.length()-1); i++) {
            if (first.charAt(i)!=last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return "";
    }
}
