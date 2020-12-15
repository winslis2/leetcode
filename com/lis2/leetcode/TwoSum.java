package com.lis2.leetcode;

import jdk.jfr.StackTrace;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    @Test
    public void test() {
        int[] ints = new int[]{2, 4, 7, 10};
        int[] ints1 = twoSumHash(ints, 14);
        System.out.println(Arrays.toString(ints1));
    }
    //两数只和 https://leetcode-cn.com/problems/two-sum/
    //暴力破解
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i <len-1 ; i++) {
            for (int j = i+1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    //哈希方法
    public int[] twoSumHash(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (hashTable.containsKey(target-nums[i])) {
                return new int[]{hashTable.get(target-nums[i]), i};
            }
            hashTable.put(nums[i],i);
        }
        return new int[0];
    }
}
