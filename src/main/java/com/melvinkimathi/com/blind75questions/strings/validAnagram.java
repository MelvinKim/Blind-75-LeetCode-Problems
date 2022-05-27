package com.melvinkimathi.com.blind75questions.strings;

import java.util.Arrays;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {

        //sort
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        if(new String(s_arr).equals(new String(t_arr))) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.printf("valid anagram: " + isAnagram(s,t));
    }
}
