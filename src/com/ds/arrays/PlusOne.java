package com.ds.arrays;

/*
https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

    public static void main(String[] s) {
        int[] arr = {1,2,3,4};
        int[] res = plusOne(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] plusOne(int[] digits) {

        int max=10, n=digits.length, rem=1;
        int i=n-1;
        int[] arr = null;
        while (i>=0 && rem>0) {
            int curr = digits[i]+rem;
            if (curr >= max) {
                rem = 1;
            } else {
                rem = 0;
            }
            digits[i] = curr%10;
            i--;
        }
        if (rem > 0) {
            arr = new int[n+1];
            arr[0] = 1;
            System.arraycopy(digits, 1, arr, 1, n-1);
            return arr;
        } else {
            return digits;
        }
    }
}
