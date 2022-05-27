package com.melvinkimathi.com.blind75questions.strings;

public class longestPalindromeSubstring {

    static void printSubStr(String s, int low, int high) {
        System.out.println(s.substring(low, high + 1));
    }

    public int longestPalindromeDynamicProgrammingSolution(String s) {

        int n = s.length();

        //create the dp table
        boolean dpTable[][] = new boolean[n][n];

        //all the substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i=0; i < n; i++) {
            dpTable[i][i] = true;
        }

        //check for the substrings of length 2
        int start = 0;
        for (int i=0; i < n-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                dpTable[i][i+1] = true;
                start = i;
                maxLength = 2;
            }
        }

        //check for the lengths greater than 2
        //k is length of substring
        for (int k=3; k <=n; k++) {
            for (int i=0; i < n-k+1; i++) {
                //Get the ending index of substring from
                //starting index i and length k
                int j = i + k - 1;

                //checking for substring from ith index to
                //jth index if s.charAt(i+1) to
                //s.charAt(j-1) is a palindrome
                if(dpTable[i+1][j-1] && s.charAt(i) == s.charAt(j)) {
                    dpTable[i][j] = true;

                    if(k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }

        System.out.println("Longest palindrome substring is: " ) ;
        printSubStr(s, start, start + maxLength -1);

        return maxLength;
    }

    public String longestPalindromeNickWhiteSolution(String s) {

        if(s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;
        int n = s.length();

        for (int i=0; i < n; i++) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end - start) {
                start = i - ((len - 1) /2);
                end = i + (len / 2);
            }

        }

        return s.substring(start, end + 1);
    }

    public int expandFromMiddle(String s, int left, int right) {

        if(s == null || left > right) return 0;

        while (left >= 0 && right < s.length() &&s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return (right - left) + 1;
    }
}
/*
two cases - "bb" , "bab"

 */