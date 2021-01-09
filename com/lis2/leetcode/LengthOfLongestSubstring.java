package com.lis2.leetcode;

import org.junit.Test;

import java.util.HashSet;


public class LengthOfLongestSubstring {

    @Test
    public void test() {
        String s = "pwwkew";
        System.out.println(myLengthOfLongestSubString(s));
    }

    //最长不含重复字符的子字符串 https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, res = 0;
        while(right < s.length()){
            char c = s.charAt(right++);
            //存在重复的字符，则移动左指针，直到滑动窗口中不含有该字符
            //pwwkew  这个地方不能使用if 第一个清除掉的是p,第二个清除掉的是w
            //如果出现重复字符，前面的set内容全部删除
            while(set.contains(c)){
                set.remove(s.charAt(left++));
            }
            set.add(c);
            res = Math.max(res, right-left);
        }
        return res;
    }

    public int myLengthOfLongestSubString(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0,right=0,res=0;
        int lenght = s.length();
        while (right<lenght) {
           char c = s.charAt(right++);
           while (set.contains(c)) {
               set.remove(s.charAt(left++));
           }
           set.add(c);
           res = Math.max(res,right-left);
        }
        return res;
    }

}
