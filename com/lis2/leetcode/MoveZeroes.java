package com.lis2.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class MoveZeroes {

    @Test
    public void  test() {
        int[] nums = {0,1,0,3,12};
//        System.out.println(Arrays.toString(moveZeroes(nums)));
        moveZeroes1(nums);
    }

    //https://leetcode-cn.com/problems/move-zeroes/
    public int[] moveZeroes(int[] nums) {
        int len = nums.length, left = 0, right = 0;
        while (right < len) {
            if (nums[right] != 0 ) {
                swap(nums,left,right);
                left++;
            }
            right++;
        }
        return nums;
    }
    public  void swap(int[] nums, int left,int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public void moveZeroes1(int[] nums) {
        if(nums==null) {
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j = 0;
        for(int i=0;i<nums.length;++i) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];

            }
        }
        System.out.println(Arrays.toString(nums));
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for(int i=j;i<nums.length;++i) {
            nums[i] = 0;
        }
    }

}
