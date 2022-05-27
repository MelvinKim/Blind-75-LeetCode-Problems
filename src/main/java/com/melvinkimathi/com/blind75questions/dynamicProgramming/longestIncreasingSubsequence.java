package com.melvinkimathi.com.blind75questions.dynamicProgramming;

import java.util.Arrays;

public class longestIncreasingSubsequence {
    public static int lengthOfLongestIncreasingSubsequence(int[] nums) {

        if(nums.length == 0 || nums == null) return 0;

        int n = nums.length;
        int[] dpTable = new int[n];
        //fill the array with 1s previously
        Arrays.fill(dpTable, 1);

        for (int i=1; i < n; i++) {
            for (int j=0; j <= i-1; j++) {
                if(nums[i] > nums[j]) {
                    dpTable[i] = Math.max(dpTable[i], dpTable[j] + 1);
                }
            }
        }

        return Arrays.stream(dpTable).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] nums = {10,1,0,3,2,3};
        System.out.println("length of longest increasing subsequence: " + lengthOfLongestIncreasingSubsequence(nums));
    }
}
