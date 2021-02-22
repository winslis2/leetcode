package com.lis2.leetcode;

import org.junit.Test;

import java.util.HashSet;

public class HappyTree {

        @Test
        public void test() {
            boolean b = happyTree(19);
            System.out.println(b);

        }

        public boolean happyTree(int n) {
            HashSet<Integer> integers = new HashSet<>();
            //19 => 82 => 68每次循环找到下一个数
            while (n !=1 && !integers.contains(n)){
                integers.add(n);
                n = getNext(n);
            }
            return n==1;
        }

        public int getNext(int n) {
            int totalNum = 0;
            while (n > 0){ //while可以遍历一个数的所有值
                int d = n % 10;
                n = n/10;
                totalNum += d*d;
            }
            return totalNum;
        }
}
