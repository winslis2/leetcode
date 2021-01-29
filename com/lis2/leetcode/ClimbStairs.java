package com.lis2.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class ClimbStairs {
    @Test
    public void test() {
        int stairs = 4;
        System.out.println(climStairs2(stairs));
    }

    //使用递归  时间复杂度为2的n次方
    public int climStairs(int n) {
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        return climStairs(n-1) + climStairs( n-2);
    }

    //递归缓存
    public int climStairs1(int n) {
        int[] memory = new int[n+1];
        return climStairs1Memory(n,memory);
    }

    public int climStairs1Memory(int n, int[] memory) {
        if (memory[n]>0 ) {
            return memory[n];
        }
        if (n == 1) {
            memory[n] = 1;
        }else if (n==2){
            memory[n] = 2;
        } else {
            memory[n] = climStairs1Memory(n-1,memory) + climStairs1Memory(n-2, memory);
        }
        return memory[n];
    }

    //动态规划
    public int climStairs2 (int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <=n ; i++) {
            p = q;
            q = r;
            r = q + p;
        }
        return r;
    }

}
