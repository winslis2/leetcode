package com.lis2.leetcode;

import org.junit.Test;

public class Candy {
    @Test
    public void test(){
        int[] ratings = {1,2,2};
        int candy = candy (ratings);
        System.out.println (candy);
    }

    public int candyp_me(int[] ratings) {
        int len = ratings.length;
        //找出最小的值,然后求两遍的值，想到用树，但是有多个0不实用
//        int[] res = new int[3];
        int min = 0;
        for (int i = 0; i < len; i++) {
            if (ratings[i] > min) {
                min = ratings[i];
            }
        }
        return 0;
    }

    public int candy(int[] ratings) {
        //左规则：当textit{ratings}[i - 1] < textit{ratings}[i] i号学生的糖果数量将比i-1号孩子的糖果数量多。左边比右边小
        //右规则：当textit{ratings}[i ] > textit{ratings}[i+1] i号学生的糖果数量将比i+1号孩子的糖果数量多。左边比右边大
        int len = ratings.length;
        int[] left = new int[len];
        for (int i = 0; i < len; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int right = 0;
        int ret = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (i < len - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            ret += Math.max (left[i], right);
        }
        return ret;
    }
}
