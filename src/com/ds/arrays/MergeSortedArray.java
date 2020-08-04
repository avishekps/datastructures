package com.ds.arrays;

public class MergeSortedArray {

    public static void main(String[] s) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m = 3,n=3;
        merge(num1, m, num2, n);
        for (int i: num1) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1,j=n-1,k=nums1.length-1;
        while (i>=0 && j>=0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (i>=0) {
            nums1[k--] = nums1[i--];
        }
        while (j>=0) {
            nums1[k--] = nums2[j--];
        }
    }
}
