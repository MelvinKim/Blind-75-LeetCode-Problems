package com.melvinkimathi.com.blind75questions.dynamicProgramming;

public class climbingStairs {
    public static int climbStairs(int n) {

        if(n <= 1) {
            return 1;
        }

        int[] dpTable = new int[n+1];
        dpTable[1] = 1;
        dpTable[2] = 2;

        for (int i=3; i <= n; i++) {
            dpTable[i] = dpTable[i-1] + dpTable[i-2];
        }

        return dpTable[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("distinct ways of climbing: " + climbStairs(n));
    }
}

/*
- use dynamic programming
- initialize dpTable
dpTable[0] = 0;
dpTable[1] = 1;
dpTable[2] = 2;

for(i=3; i < n; i++)
    dpTable[i] = dpTable[i-1] + dpTable[i-2]

return dpTable[n]
 */