package com.lis2.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindTheDifference {

    @Test
    public void test() {
        String s = "abcd";
        String t = "abcde";
        char theDifference = findTheDifference1 (s, t);
        System.out.println (theDifference);
    }

    //389:找不同 https://leetcode-cn.com/problems/find-the-difference/
    //自己写的
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> scharacterIntegerHashMap = new HashMap<> ();
        HashMap<Character, Integer> tcharacterIntegerHashMap = new HashMap<> ();

        for (int i = 0; i < s.length (); i++) {
            String substring = s.substring (i, i + 1);
            boolean b = scharacterIntegerHashMap.containsKey (substring.charAt (0));
            if (b) {
                Integer integer = scharacterIntegerHashMap.get (substring.charAt (0));
                scharacterIntegerHashMap.put (substring.charAt (0), integer+1);
            }else {
                scharacterIntegerHashMap.put (substring.charAt (0), 1);
            }
        }

        for (int i = 0; i < t.length (); i++) {
            String substring = t.substring (i, i + 1);
            boolean b = tcharacterIntegerHashMap.containsKey (substring.charAt (0));
            if (b) {
                Integer integer = tcharacterIntegerHashMap.get (substring.charAt (0));
                tcharacterIntegerHashMap.put (substring.charAt (0), integer+1);
            }else {
                tcharacterIntegerHashMap.put (substring.charAt (0), 1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> iterator = tcharacterIntegerHashMap.entrySet ().iterator ();
        char diff = 0;
        while (iterator.hasNext ()) {
            Map.Entry<Character, Integer> next = iterator.next ();
            if (scharacterIntegerHashMap.containsKey (next.getKey ())) {
                //判断值是否相等
                if (scharacterIntegerHashMap.get (next.getKey ())!=next.getValue ()){
                    diff = next.getKey ();
                }
            }else {
                diff = next.getKey ();
            }
        }
        return diff;
    }

    //官方
    public char findTheDifference1(String s, String t) {
        int ret = 0;
        for (int i = 0; i < s.length(); ++i) {
            System.out.println ((int)s.charAt (i));
            ret ^= s.charAt(i);
            System.out.println (ret);
            System.out.println ("----------------------");

        }
        for (int i = 0; i < t.length(); ++i) {
            ret ^= t.charAt(i);
        }
        return (char) ret;
    }

}
