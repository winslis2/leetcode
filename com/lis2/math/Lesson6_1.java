package com.lis2.math;

import org.junit.Test;

import java.util.Arrays;

public class Lesson6_1 {

    @Test
    public void test() {
        int[] test = {7,2,3,4,5,6,9,8,0,1};
        System.out.println(Arrays.toString(merge_sort(test)));

    }
    public  int[] merge_sort(int[] to_sort) {
       if (to_sort==null) return new int[0];
       if (to_sort.length==1)return to_sort;
       int mid = to_sort.length/2;
       int[] left = Arrays.copyOfRange(to_sort,0,mid);
       int[] right = Arrays.copyOfRange(to_sort,mid,to_sort.length);
       left = merge_sort(left);
       right = merge_sort(right);
       return merge(left,right);
    }

    public int[] merge(int[] a, int[]b) {
        if (a==null || b==null) return new int[0];
        int[] merged = new int[a.length + b.length];
        int mi=0,ai=0,bi=0;
        while (ai<a.length && bi<b.length) {
            if (a[ai]<b[bi]) {
                merged[mi]=a[ai];
                ai++;
            }else {
                merged[mi]=b[bi];
                bi++;
            }
            mi++;
        }

        //处理数组中剩余的数字
        if (ai<a.length) {
            for (int i = ai; i <a.length ; i++) {
                merged[mi]=a[i];
                mi++;
            }
        }
        if (bi<a.length) {
            for (int i = bi; i <b.length ; i++) {
                merged[mi]=b[i];
                mi++;
            }
        }
        return merged;
    }
}
