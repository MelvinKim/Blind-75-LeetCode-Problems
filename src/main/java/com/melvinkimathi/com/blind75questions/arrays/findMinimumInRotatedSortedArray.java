package com.melvinkimathi.com.blind75questions.arrays;

public class findMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {

        if(nums == null || nums.length == 0) return 0;

        if(nums.length == 1) return nums[0];

        int n = nums.length;
        int left = 0;
        int right = n-1;

        while (left < right) {
            int midpoint = left + (right -left) / 2;
            //case 1
            if(midpoint > 0 && nums[midpoint] < nums[midpoint-1]) {
                return nums[midpoint];
            }
            else if(nums[left] <= nums[midpoint] && nums[midpoint] > nums[right]) {
                left = midpoint + 1;
            }
            else {
                right = midpoint - 1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.printf("minimum in rotated sorted array: " + findMin(nums));
    }
}
