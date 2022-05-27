package com.melvinkimathi.com.blind75questions.dynamicProgramming;

public class jumpGame {
    public static boolean canJump(int[] nums) {

        int n = nums.length;
        int lastGoodIndexPosition = n - 1;

        for (int i = n-1; i >= 0; i--) {
            if(i + nums[i] >= lastGoodIndexPosition) {
                lastGoodIndexPosition = i;
            }
        }

        return lastGoodIndexPosition == 0;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println("can jump: " + canJump(nums));
    }
}
