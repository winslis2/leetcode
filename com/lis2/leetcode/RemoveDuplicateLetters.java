package com.lis2.leetcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Calendar;

public class RemoveDuplicateLetters {
    @Test
    public void test() {
        String s = "abcda";
        String s1 = removeDuplicateLetters (s);
        System.out.println (s1);

    }

    //316. 去除重复字母  https://leetcode-cn.com/problems/remove-duplicate-letters/
    public String removeDuplicateLetters(String s) {
        int len = s.length ();
        char[] chars = s.toCharArray ();
        //不使用包装类有默认值，使用包装类会变成null
        int[] lastIndex = new int[26];
        //保存每个字符最后出现的下标
        //abcda =>[4, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i < len; i++) {
            lastIndex[chars[i]-'a'] = i;
        }
        ArrayDeque<Character> stack = new ArrayDeque<> ();
        //字符在栈中是否出现
        boolean[] visited = new boolean[26];
        for (int i = 0; i <len ; i++) {
            //如果在栈中已经存在，舍弃这个字符  a | b | c | b 要舍弃这个最后一个字符b
            if (visited[chars[i]-'a']) {
                continue;
            }
            //栈不是空，且栈顶元素大于当前元素，且栈顶元素出现的下标大于i，后面还有改字符
            while (!stack.isEmpty () && stack.peekLast () > chars[i] && lastIndex[stack.peekLast () - 'a']>i) {
                Character top = stack.removeLast (); //删除栈顶元素   栈顶元素发生变化，继续循环判断栈顶元素
                visited[top-'a'] = false;
            }

            stack.addLast (chars[i]);
            visited[chars[i]-'a'] = true;

        }
        StringBuilder stringBuilder = new StringBuilder ();
        for (char c:stack) {
            stringBuilder.append (c);
        }
        return stringBuilder.toString ();
    }
}
