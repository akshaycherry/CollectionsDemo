package com.akshay.leetcode.practice;

public class LeetCode1 {
	    int count=0;
	    int temp=0;
	    public int findMaxConsecutiveOnes(int[] nums) {
	        int size=nums.length;
	        for(int i=0;i<size;i++){
	            if(nums[i]==1){
	                count++;
	            }
	            else if(nums[i]==0 && (i!=size-1)) {
	                temp=count;
	                count=0;
	                continue;
	            }
	            else if(nums[i]==0 && (i==size-1))
	                break;
	            }
	        return count;
	    }
	}


