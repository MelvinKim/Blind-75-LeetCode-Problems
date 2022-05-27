package com.melvinkimathi.com.blind75questions.strings;

public class minimumWindowSubstring {
    public String minWindow(String s, String t) {

        //check 1
        if(t.length() > s.length()) return "";

        int a_pointer = 0;
        int b_pointer = 0;
        int minLength = 0;
        int N = s.length();

        while (b_pointer < N) {
            if(t.indexOf(s.charAt(b_pointer)) != -1) {
                b_pointer++;
                //update minlength
                minLength = Math.min((b_pointer - a_pointer) + 1, minLength);
            }
            else {
                a_pointer++;
            }
        }

        return s.substring(a_pointer, b_pointer);
    }
}
