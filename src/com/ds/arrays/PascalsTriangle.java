package com.ds.arrays;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] s) {

        List<List<Integer>> triangle = generate(5);
        for (List<Integer> list : triangle) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {

        if (numRows == 0) {
            return new LinkedList<>();
        }

        List<List<Integer>> res = new LinkedList<>();
        List<Integer> init = new LinkedList<>();
        init.add(1);
        res.add(init);
        for (int i=1;i<numRows;i++) {
            List<Integer> prev = res.get(i-1);
            List<Integer> list = new LinkedList<>();
            for (int j=0;j<=i;j++) {
                int l=0,r=0,curr=1;
                if (j-1>=0) {
                    l=prev.get(j-1);
                }
                if (j<=prev.size()-1) {
                    r=prev.get(j);
                }
                if (l!=0 || r!=0) {
                    curr = l + r;
                }
                list.add(curr);
            }
            res.add(list);
        }
        return res;
    }
}
