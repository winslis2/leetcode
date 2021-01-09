package com.lis2.leetcode;

import org.junit.Test;

import java.util.HashSet;

public class FindRepeatNumber {
    @Test
    public void test() {
        int[] ints = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(ints));

    }

    //数组中重复的数字 https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return 0;
    }
}
