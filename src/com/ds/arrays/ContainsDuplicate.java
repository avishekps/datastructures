package com.ds.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] s) {
        int[] arr = {1,2,3,1};
        System.out.print("Arrays Contains Duplicate: " + containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
