package com.ds.arrays;
/*
https://leetcode.com/problems/majority-element/
Solution: Moore's Voting Algorithm
 */
public class MajorityElement {

    public static void main(String[] s) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println("Majority element of array is: " + majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {

        int ele = nums[0];
        int count=1;
        for (int i=1;i<nums.length;i++) {
            if (ele == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ele = nums[i];
                count++;
            }
        }
        return ele;
    }
}
