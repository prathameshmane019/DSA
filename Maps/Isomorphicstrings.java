// 205. Isomorphic Strings
// Easy
// Topics
// Companies
// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

// Example 1:

// Input: s = "egg", t = "add"

// Output: true

// Explanation:

// The strings s and t can be made identical by:

// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.
// Example 2:

// Input: s = "foo", t = "bar"

// Output: false

// Explanation:

// The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

// Example 3:

// Input: s = "paper", t = "title"

// Output: true

 

// Constraints:

// 1 <= s.length <= 5 * 104
// t.length == s.length
// s and t consist of any valid ascii character.

import java.util.HashMap;
import java.util.Map;

public class Isomorphicstrings {
    public static boolean isIsomorphic(String s, String t) {
   Map<Character, Character> mp = new HashMap<>();
        char[] st1 = s.toCharArray();
        char[] st2 = t.toCharArray();

        if (st1.length != st2.length) {
            return false;
        } 
        for (int i = 0; i < st1.length; i++) {
            if (!mp.containsValue(st2[i])) {
                mp.putIfAbsent(st1[i], st2[i]);
            }
            System.out.println(mp);
            if ( st2[i]!=(mp.getOrDefault(st1[i],' '))) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }
}
