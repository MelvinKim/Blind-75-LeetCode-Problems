package com.melvinkimathi.com.blind75questions.dynamicProgramming;

public class jumpGameII {
    public static int jump(int[] nums) {

        if(nums.length == 0) return 0;

        if(nums.length == 1) return 0;

        int n = nums.length;
        int lastGoodIndexPosition = n - 1;
        int jumpsMade = 0;
        int minJumpsMade = Integer.MAX_VALUE;

        for (int i=n-1; i>=0; i--) {
            jumpsMade = 1;
            for (int j=i; j>=0; j--) {
                if(j + nums[j] >= lastGoodIndexPosition) {
                    lastGoodIndexPosition = i;
                    jumpsMade++;
                }
            }

            if(lastGoodIndexPosition == 0) {
                minJumpsMade = Math.min(minJumpsMade, jumpsMade);
            }
        }

        return minJumpsMade;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println("min jumps required: " + jump(nums));
    }
}
