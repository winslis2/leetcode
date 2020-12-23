package com.lis2.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FristUniqChar {
    @Test
    public void test() {
        String string = "loevleetcode";
        int i = fristUniqChar (string);
        System.out.println (i);


    }

    //找出第一个不同的字符 https://leetcode-cn.com/problems/first-unique-character-in-a-string/
    //虽然是进行了两次循环但是复杂度还是线性的，并不是算数级别的
    public int fristUniqChar(String s) {
        char[] chars = s.toCharArray ();
        int len = chars.length;
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<> ();
//        ArrayList<Character> repeateChar = new ArrayList<> ();
        for (int i = 0; i < len; i++) {
            //getOrDefault这个方法就不用判断是否存在了
            characterIntegerHashMap.put (chars[i],characterIntegerHashMap.getOrDefault (chars[i],0)+1);
        }
        for (int i = 0; i < len ; i++) {
            if (characterIntegerHashMap.get (chars[i])==1){
                return i;
            }
        }
        return -1;
    }
}
