package com.lis2.leetcodenextday;

import org.junit.Test;
import java.util.Arrays;

public class MoveZeroes {
    @Test
    public void test() {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int left=0,right=0;
        for (int num : nums) {
            if (num != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums,int left,int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
