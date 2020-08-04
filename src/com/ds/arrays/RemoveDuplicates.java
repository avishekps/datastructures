package com.ds.arrays;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {

    public static void main(String[] s) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
