package com.lis2.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    @Test
    public void test() {
        int[] num = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(num));
    }

    //  https://leetcode-cn.com/problems/3sum/
    public List<List<Integer>> threeSum(int[] nums) {
         int n = nums.length;
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int first=0; first <n ; first++) {
            if (first>0 && nums[first] == nums[first-1]){
                continue;
            }
            int third = n-1;
            int target = -nums[first];
            for (int second = first+1; second <n ; second++) {
                if (second>first+1 && nums[second]==nums[second-1]){
                    continue;
                }
                //找到一个合适的third进行对比
                while (second < third && nums[second]+nums[third]>target) {
                    third--;
                }
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] ==target) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
