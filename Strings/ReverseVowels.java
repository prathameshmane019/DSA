// 345. Reverse Vowels of a String
// Easy
// Topics
// Companies
// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:

// Input: s = "leetcode"

// Output: "leotcede"

 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        Set<Character> vowels =new HashSet<>();
        vowels.addAll(Arrays.asList(new Character[] {'a','e','i','o','u','A','E','I','O','U'}));
        while(l<r){ 
            if(!vowels.contains(sb.charAt(l))){
                l++;
            }
            else if (!vowels.contains(sb.charAt(r))) {
                r--;                
            }
            else{
                char temp = sb.charAt(r);
                sb.setCharAt(r, sb.charAt(l));
                sb.setCharAt(l, temp);
                r--;
                l++;
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        System.out.println(rv.reverseVowels("IceCream"));
    }
}