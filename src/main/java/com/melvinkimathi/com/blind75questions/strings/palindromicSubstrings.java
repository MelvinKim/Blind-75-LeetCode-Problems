package com.melvinkimathi.com.blind75questions.strings;

public class palindromicSubstrings {
    public int countSubstrings(String s) {

        int n = s.length();
        boolean[][] dpTable = new boolean[n][n];

        //fill the table for [0][0] [1][1] [2][2] etc
        for (int i=0; i < n; i++) {
            dpTable[i][i] = true;
        }

        //fill for the second case
        for (int j=0; j < n-1; j++) {
            if(s.charAt(j) == s.charAt(j+1)) {
                dpTable[j][j+1] = true;
            }
        }

        //fill for the length greater than 2
        for (int k=3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;

                if(dpTable[i+1][j-1] && s.charAt(i) == s.charAt(j)) {
                    dpTable[i][j] = true;
                }
            }
        }


        //loop over the 2D array adding all elements == 1
        int totalSum = 0;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if(dpTable[a][b] == true) {
                    totalSum++;
                }
            }
        }

        return totalSum;
    }
}
