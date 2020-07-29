package com.ds.arrays;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/two-sum/
Solution: Hashing
 */
public class TwoSum {

    public static void main(String[] s) {
        int arr[] = {2,11,15,7};
        int target = 9;
        int[] res = twoSum(arr, target);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int res[] = new int[2];
        map.put(nums[0],0);
        for (int i=1;i<nums.length;i++) {
            if (map.containsKey(target-nums[i])) {
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                break;
            } else {
                map.put(nums[i],i);
            }
        }

        return res;
    }
}
