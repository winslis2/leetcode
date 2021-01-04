package com.lis2.leetcode;

import org.junit.Test;

public class Fib {
    @Test
    public void test() {
        System.out.println(fib(5));
    }

    //509. 斐波那契数 https://leetcode-cn.com/problems/fibonacci-number/
    //利用滚动数组
    public int fib(int n) {
        if (n<2) {
            return n;
        }
        int q = 0;
        int p = 0;
        int r = 1;
        for (int i = 2; i <=n ; i++) {
            q = p;
            p = r;
            r = p+q;
        }
        return r;
    }
}