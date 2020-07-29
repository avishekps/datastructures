package com.ds.arrays;
/*
https://leetcode.com/problems/move-zeroes/
Solution: Two pointer Approach
 */
public class MoveZeros {
    public static void main (String[] s) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void moveZeroes(int[] arr) {

        for (int lastZeroInd = 0, currInd = 0; currInd < arr.length; currInd++) {
            if (arr[currInd] !=0) {
                swap(arr,lastZeroInd++,currInd);
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int t1= arr[i];
        arr[i] = arr[j];
        arr[j] = t1;
    }
}
