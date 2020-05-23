package com.akshay.leetcode.practice;

public class LeetCode11 {
	    int count=0;
	    int temp=0;
	    public int findMaxConsecutiveOnes(int[] nums) {
	        int size=nums.length;
	        for(int i=0;i<size;i++){
	            if(nums[i]==1){
	                count++;
	                if(count>temp)
	                   temp=count;
	            }
	            else if(nums[i]==0 && (i!=size-1)) {
	                count=0;
	                continue;
	            }
	            else if(nums[i]==0 && (i==size-1)){
	                break;
	            }
	            
	        }
	        if (temp>count)
	            return temp;
	        else
	            return count;

	    }
	}

