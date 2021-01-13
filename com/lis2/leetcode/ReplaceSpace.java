package com.lis2.leetcode;

import org.junit.Test;

public class ReplaceSpace {
    @Test
    public void test() {
        String str = "he l l o";
        System.out.println(replaceSpace(str));

    }
    //剑指 Offer 05. 替换空格 https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==32) {
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
