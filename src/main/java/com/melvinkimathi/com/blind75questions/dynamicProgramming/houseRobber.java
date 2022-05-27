package com.melvinkimathi.com.blind75questions.dynamicProgramming;

import java.util.Arrays;

public class houseRobber {
    public static int rob(int[] nums) {

        int n = nums.length;;
        if(n == 0 || nums == null) {
            return 0;
        }
        if(n == 1) {
            return nums[0];
        }
        if(n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        //for larger numbers
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i=2; i < dp.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i-2],
                    dp[i-1]);
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println("maximum can rob: " + rob(nums));
    }
}
