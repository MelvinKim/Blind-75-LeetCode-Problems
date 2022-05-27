package com.melvinkimathi.com.blind75questions.arrays;

public class maximumSubArray {
    public static int maxSubArray(int[] nums) {

        if(nums.length == 0) return 0;

        int n = nums.length;
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i=1; i < n; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.printf("maximum subarray: " + maxSubArray(arr));
    }
}
