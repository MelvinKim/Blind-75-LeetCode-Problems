package com.melvinkimathi.com.blind75questions.arrays;

public class searchInRotatedSortedArray {
    public static int search(int[] nums, int target) {

        //base case
        if(nums.length == 0 || nums == null) return -1;

        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int midpoint = left + (right -left) / 2;
            //case 1
            if(nums[midpoint] > nums[right]) {
                left = midpoint + 1;
            } else {
                right = midpoint;
            }
        }


       return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("index: " + search(nums, target));
    }
}
