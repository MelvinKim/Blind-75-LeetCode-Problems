package com.melvinkimathi.com.blind75questions.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
            if(hm.containsKey(target - nums[i]))
                return new int[] {i, hm.get(target - nums[i])};
            else hm.put(nums[i], i);
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        System.out.printf("Results: " + Arrays.toString(twoSum(nums,target)));
    }
}
