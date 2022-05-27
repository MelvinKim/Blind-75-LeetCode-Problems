package com.melvinkimathi.com.blind75questions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        if(nums.length == 0 || nums == null) return result;

        if(nums.length < 3) return result;

        //sort
        Arrays.sort(nums);

        //iteration
        for (int i=0; i < n-2; i++) {
            int missingSum = 0 - nums[i];
            List<Integer> list = new ArrayList<>();
            int left = i+1;
            int right = n-1;

            while (left < right) {
                if(nums[left] + nums[right] == missingSum) {
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);

                    //check if the list already contains that combination
                    if(!result.contains(list) && !list.isEmpty()) {
                        result.add(list);
                    }

                    list = new ArrayList<>();
                }
                else if(nums[left] + nums[right] > missingSum) {
                    right--;
                }
                else {
                    left++;
                }

                left++;
                right--;
            }


        }

        //TODO:
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println("Triplet sum: " + threeSum(nums));
    }
}
