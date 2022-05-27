package com.melvinkimathi.com.blind75questions.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {

        //base case
        if(nums.length == 0) return false;

        //create a set
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        //compare length
        if(set.size() == nums.length) return false;

        return true;
    }

    //solution 2 --> sorting
    public static boolean containsDuplicateThroughSorting(int[] nums) {

        //sort
        Arrays.sort(nums);

        //compare adjacent elements
        for (int i=0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.printf("Contains duplicate: " + containsDuplicateThroughSorting(nums));
    }
}
