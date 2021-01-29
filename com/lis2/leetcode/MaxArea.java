package com.lis2.leetcode;

import org.junit.Test;

public class MaxArea {
    @Test
    public void test() {
        int[] test = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(test));
    }

    //https://leetcode-cn.com/problems/container-with-most-water/solution/container-with-most-water-shuang-zhi-zhen-fa-yi-do/
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int answer = 0;
        while (left < right) {
            int area = Math.min(height[left],height[right])*(right-left);
            answer = Math.max(answer, area);
            if (height[left] > height[right]) {
                right--;
            }else {
                left++;
            }
        }
        return answer;
    }
}
