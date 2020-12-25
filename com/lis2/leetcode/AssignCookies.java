package com.lis2.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class AssignCookies {
    // 455. 分发饼干 https://leetcode-cn.com/problems/assign-cookies/
    @Test
    public void test() {
        int[] s = {1,2,3};
        int[] c = {3};
        int contentChildren = findContentChildren1 (s, c);
        System.out.println (contentChildren);

    }

    //循环人 然后内层判断饼干是否符合要求，但怎么保证满足最多的孩子？
    public int findContentChildren(int[] chlidren, int[] cookie) {
        Arrays.sort (chlidren);
        Arrays.sort (cookie);
        int chlidrenLen = chlidren.length;
        int cookieLen = cookie.length;
        if(cookieLen==0) {
            return 0;
        }
        int cookieIndex = 0;
        for (int i = 0; i <chlidrenLen ; i++) {
            //循环饼干，当饼干数大于等于孩子所需要的胃口值时，饼干向后挪
             while (cookieLen-1>=cookieIndex && cookie[cookieIndex]>=chlidren[i]  ){
                 cookieIndex++;
                 break;//跳出while循环
             }
             //如果饼干循环完毕，第一个饼干就不够最小胃口,
             if (cookieIndex>cookieLen || cookieIndex==0 || (cookieIndex>i && i != 0) ) {
                 return i+1;
             }
             //最后一个饼干不符合
             if (cookie[cookieLen-1] < chlidren[i]) {
                 return i;
             }

        }
        return 0;
    }

    public int findContentChildren1(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        //g的索引 孩子
        int i = 0;
        //s的索引 饼干
        int j = 0;
        //直接循环两个，这个比官方的做法要好
        while (i < g.length && j < s.length) {
            //只有满足条件，才能喂好孩子
            if (g[i] <= s[j]) {
                i++; //孩子往后排
            }
            j++; //无论如何饼干都往后排
        }
        return i; //返回孩子
    }
}
