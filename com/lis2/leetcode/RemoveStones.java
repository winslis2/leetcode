package com.lis2.leetcode;

import org.junit.Test;

import java.util.HashSet;

public class RemoveStones {
    @Test
    public void test() {
        int[][] a = {{0,1},{1,0},{1,1}};

        System.out.println(removeStones(a));
    }

    public int removeStones(int[][] stones) {
        //不符合移除石头的最大数条件
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        int len = stones.length;
        int num = 0;
        for (int i = 0; i <len ; i++) {
            int row = stones[i][0];
            int col = stones[i][1];
            if (rowSet.contains(row) || colSet.contains(col)){
                num++;
            }
            rowSet.add(row);
            colSet.add(col);

        }
        return num;

    }
}
