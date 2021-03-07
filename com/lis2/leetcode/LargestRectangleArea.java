package com.lis2.leetcode;

public class LargestRectangleArea {
    public static void main(String[] args) {
        int[] height = {5,6,2,3};
        System.out.println(largestRectangleArea1(height));
    }
   
    //暴力破解 使用5,6,2,3的时候会出错，会取5和3 中间隔了四个 3*4=12 但是没有考虑中间还有个2
    public static int largestRectangleArea(int[] height) {
        int area = 0;
        int current = 0;
        //以i为高 j为宽
        for (int i = 0; i <height.length ; i++) {
            for (int j = i; j < height.length; j++) {
                if (i==j) {
                    current = height[i];
                }else {
                    current = Math.min(height[i], height[j]) * (j-i+1);
                }
                area = Math.max(area, current);
            }
        }
        return area;
    }
    //暴力法 超出时间限制
    public static int largestRectangleArea1(int[] height) {
        int Area = 0;
        for (int i = 0; i <height.length ; i++) {
            //以i为高找到 符合条件的宽
            //找到左边最后一个大于等于height[i]的下标
            //找到右边最后一个大于等于height[i]的下标
            //左边和右边共同确定宽度

            int left = i;
            while (left > 0 && height[left-1] >= height[i]) {
                left--;
            }
            int right = i;
            while (right < height.length - 1 && height[right+1] >= height[i]) {
                right++;
            }
            int width = right - left + 1;
            Area = Math.max(width * height[i], Area);
        }
        return  Area;
    }
}
