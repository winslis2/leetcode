package com.lis2.leetcode;

import org.junit.Test;

import java.util.PriorityQueue;

public class LastStoneWeigh {
    @Test
    public void test() {
        int[] test = {2,7,4,1,8,1};
        System.out.println (lastStoneWeight (test));
    }

    //1046. 最后一块石头的重量 https://leetcode-cn.com/problems/last-stone-weight/
    //相减 最后的结果>=0   不是单纯的靠想需要结合数据类型
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> sq = new PriorityQueue<> ((a,b)->b-a);
        for (int item:stones) {
            sq.offer (item);
        }
        //只要有两个就要相减
        while (sq.size ()>1) {
            int a = sq.poll ();
            int b = sq.poll ();
            if (b<a) {
                sq.offer (a-b);
            }
        }
        return sq.isEmpty ()? 0:sq.poll ();
    }
}
