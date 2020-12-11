package com.lis2.leetcode;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

//删除排序数组中的重复项 https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
public class RemoveDuplicates {
    @Test
    public void test() {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int i = this.removeDuplicates (arr);
        System.out.println (i);
    }

//    @Test不能两个都标明是Test
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            //主要是把不重复的j赋值给i,只有不重复了才往下走
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
