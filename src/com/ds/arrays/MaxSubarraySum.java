package com.ds.arrays;

/*
https://leetcode.com/problems/maximum-subarray/
 */
public class MaxSubarraySum {

    public static void main(String[] s) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Result: " + maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int currSum = nums[0], maxSum = nums[0], n = nums.length;
        for (int i=1;i<n;i++) {
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
