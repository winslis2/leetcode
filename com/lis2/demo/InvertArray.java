package com.lis2.demo;

import org.junit.Test;

import java.util.Arrays;

public class InvertArray {
    @Test
    public void test() {
        int[] a = {1,2,3,4,5};
        int len = a.length;
        for (int i = 0; i < len/2; i++) {
            int tmp = a[i];
            a[i] = a[len-i-1];
            a[len-i-1] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
