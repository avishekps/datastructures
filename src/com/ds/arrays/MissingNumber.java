package com.ds.arrays;

public class MissingNumber {

    public static void main(String[] s) {

        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing Number: " + missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {

        int cSum=0,n=nums.length;
        for (int i: nums) {
            cSum+=i;
        }
        int sum= (n*(n+1))/2;
        return sum-cSum;
    }
}
