package com.lis2.leetcode;


import org.junit.Test;

import java.util.Arrays;

public class Rotate {

    //189. 旋转数组 https://leetcode-cn.com/problems/rotate-array/
    @Test
    public void rotate() {
        //思路：截成两段，然后拼接
        int k = 3;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
        System.out.println(Arrays.toString(newArr));
    }}
