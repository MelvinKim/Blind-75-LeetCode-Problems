package com.melvinkimathi.com.blind75questions.arrays;

import java.util.Arrays;

public class maximumProductSubArray {
    public static int maxProduct(int[] nums) {

        int n = nums.length;
        int[] dpTable = new int[n];
        dpTable[0] = nums[0];

        for (int i=1; i < n; i++) {
            dpTable[i] = Math.max(dpTable[i-1] * dpTable[i], dpTable[i-1]);
        }

        return Arrays.stream(dpTable).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.printf("maximum product subarray: " + maxProduct(nums));
    }
}
