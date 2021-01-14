package com.lis2.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrefixesDivBy5 {
    @Test
    public void test() {
        int[] test = {0,1,1};
        System.out.println(prefixesDivBy5(test));
    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        ArrayList<Boolean> booleans = new ArrayList<>();
        //[0,1,1]
        int prefix = 0;
        int length = A.length;
        for (int i = 0; i <length ; i++) {
            //这里可以推广成一个公式，把二进制从左到右得到十进制数 prefix=0 prefix*2+当前值（0｜1）
            //能不能被5整除就是判断这个数对5取模是不是0
            prefix = ((prefix<<1)+A[i]) % 5;
            booleans.add(prefix==0);
        }
        return booleans;
    }
}
