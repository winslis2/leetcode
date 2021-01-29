package com.lis2.math;

import java.util.Arrays;
import java.util.LinkedList;

public class Lesson10_1 {
    //字符串的编辑距离
    public static void main(String[] args) {
        System.out.println(getStrDistance("", "mouuse"));
    }

    public static int getStrDistance(String a, String b) {
        if (a == null || b == null) return -1;
        int[][] d = new int[a.length() + 1][b.length() + 1];
        //下面两个循环是必须要写的，否则空字符会出错
        //如果i为0且j>=0 那么d[i,j]为j
        for (int j = 0; j <= b.length(); j++) {
            d[0][j] = j;
        }
        //如果j为0且i>=0那么d[i,j]为i
        for (int i = 0; i <= a.length(); i++) {
            d[i][0] = i;
        }
        //实现状态转移方程 如果一个是空字符串不会进入循环，使用上面循环的结果
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                int r = 0;
                if (a.charAt(i) != b.charAt(j)) {
                    r = 1;
                }
                int first_append = d[i][j + 1] + 1;
                int second_append = d[i + 1][j] + 1;
                int replace = d[i][j] + r;
                int min = Math.min(first_append, second_append);
                min = Math.min(min, replace);
                d[i + 1][j + 1] = min;
            }
        }
        System.out.println(Arrays.deepToString(d));
        return d[a.length()][b.length()];
    }
}
