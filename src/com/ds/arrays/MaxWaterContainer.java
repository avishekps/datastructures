package com.ds.arrays;
/*
https://leetcode.com/problems/container-with-most-water/solution/
 */
public class MaxWaterContainer {

    public static void main(String[] s) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max Container area with water: " + maxArea(arr));
    }

    public static int maxArea(int[] height) {

        int i=0,n=height.length,j=n-1,max=0;
        while (i<j) {
            max = Math.max(Math.min(height[i], height[j])*(j-i), max);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
