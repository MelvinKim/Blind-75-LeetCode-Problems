package com.melvinkimathi.com.blind75questions.strings;

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s ) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (b_pointer < s.length()) {
            //check 1 --> if character is not in the hashset, let's add it to the hashset
            if(!hashSet.contains(s.charAt(b_pointer))) {
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                //update max
                max = Math.max(hashSet.size(), max);
            }
            //check 2 --> if char is already in the hashset, remove it from the set (char at a_pointer)
            else {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.printf("length of longest substring: " + lengthOfLongestSubstring(s));
    }
}
