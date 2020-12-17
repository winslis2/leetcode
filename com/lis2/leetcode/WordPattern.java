package com.lis2.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {

    @Test
    public void test() {
        String str1 = "abba";
        String str2 = "dog dog dog dog";
        boolean b = wordPattern (str1, str2);
        System.out.println (b);

    }

    //单词规律 https://leetcode-cn.com/problems/word-pattern/
    public boolean wordPattern(String pattern, String s) {
        char[] chars = pattern.toCharArray ();
        String[] split = s.split ("\\s");
        if (chars.length != split.length) {
            return false;
        }
        HashMap<String, String> HashMap = new HashMap<> ();

        for (int i = 0; i < split.length; i++) {
            if (!HashMap.containsKey (String.valueOf (chars[i])) && !HashMap.containsValue (split[i])) {
                HashMap.put ( String.valueOf (chars[i]),split[i]);
            } else{
//                System.out.println (HashMap.get (split[i]));
//                System.out.println (String.valueOf (chars[i]));
                if(!HashMap.containsKey (String.valueOf(chars[i])) || !HashMap.get (String.valueOf(chars[i])).equals (split[i])) {
                     return false;
                 }
            }
        }
        return true;
    }
}
