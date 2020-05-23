package com.akshay.leetcode.practice;

public class LeetCodeProblem1 {
	public int[] twoSum(int[] nums, int target) {
        int[] result =new int[2];
        int size = nums.length;
        for(int index = 0 ; index < size ; index++){
            for(int i = 1 ; i < size ; i++){
                if(nums[index] + nums[i] == target)
                    result[0]=index;
                    result[1]=i;
                    break;
            }
        }
        return result;
    }

}
