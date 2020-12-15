package com.lis2.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Flower {
    //种花问题 https://leetcode-cn.com/problems/can-place-flowers/
    //{0, 0, 1, 0,1} 是可以种花的
    @Test
    public void test() {
        int[] ints = {0, 0, 1, 0,1};
        boolean b = canPlaceFlowers (ints, 2);
        System.out.println (b);
    }


    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int num = 0;
        for (int i = 0; i < len; i++) {
            //满足条件自身为0， 如果是第一个不是0，i-1就要是0，如果最后一个不是0，i+1就要是0
            if (flowerbed[i] == 0 &&
               (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
               num++;
               i = i+1;
            }
        }
        return num >= n;
    }
}
