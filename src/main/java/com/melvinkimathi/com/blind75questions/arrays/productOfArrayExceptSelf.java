package com.melvinkimathi.com.blind75questions.arrays;

import java.util.Arrays;

public class productOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] outputProducts = new int[n];

        //initialize the needed variables
        leftProducts[0] = 1;
        rightProducts[n-1] = 1;

        //calculate the left products
        for (int i=1; i < n; i++) {
            leftProducts[i] = nums[i-1] * leftProducts[i-1];
        }

        //calculate the right products
        for (int j=n-2; j >= 0; j--) {
            rightProducts[j] = nums[j+1] * rightProducts[j+1];
        }

        //calculate the final array
        for (int k=0; k < n; k++) {
            outputProducts[k] = leftProducts[k] * rightProducts[k];
        }

        return outputProducts;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.printf("product of array except self: " + Arrays.toString(productExceptSelf(nums)));
    }
}

