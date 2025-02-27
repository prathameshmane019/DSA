// 459. Repeated Substring Pattern
// Easy
// Topics
// Companies
// Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

 

// Example 1:

// Input: s = "abab"
// Output: true
// Explanation: It is the substring "ab" twice.
// Example 2:

// Input: s = "aba"
// Output: false
// Example 3:

// Input: s = "abcabcabcabc"
// Output: true
// Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 

// Constraints:

// 1 <= s.length <= 104
// s consists of lowercase English letters.

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sub = new StringBuilder();
        int j=0;
        int i=0;
        while (j<s.length()/2 ) {
            sub.append(s.charAt(j));
            
            j++;
            if (sub.charAt(i)==s.charAt(i+j)) {   
            break;
            }
        } 
        System.out.println(sub);

        while (k < s.length()/2) {
            if (sub.charAt(k)!=s.charAt(k+j)) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        RepeatedSubstringPattern rs =new RepeatedSubstringPattern();
        System.out.println(rs.repeatedSubstringPattern("abab"));
    }
}
