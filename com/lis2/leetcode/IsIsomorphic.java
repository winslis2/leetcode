package com.lis2.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IsIsomorphic {
    @Test
    public void test() {
        String s = "paper";
        String t = "titll";
        isIsomorphic2 (s,t);
    }

    //205. 同构字符串  https://leetcode-cn.com/problems/isomorphic-strings/
    public void isIsomorphic1(String s, String t) {
        //思路找出两个字符串的对应关系
        HashMap<Character, Character> smap = new HashMap<> ();
        HashMap<Character, Character> tmap = new HashMap<> ();
        int len = s.length ();
        for (int i = 0; i < len; i++) {
            if (!smap.containsKey (s.charAt (i))) {
                smap.put (s.charAt (i), t.charAt (i));
            }
            if (!tmap.containsKey (t.charAt (i))) {
                tmap.put (t.charAt (i), s.charAt (i));
            }
        }
        Set<Character> characters = smap.keySet ();

        System.out.println (characters);
        System.out.println (smap);
        System.out.println (tmap);
        Iterator<Map.Entry<Character, Character>> iterator = smap.entrySet ().iterator ();

    }
public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> s2t = new HashMap<> ();
        HashMap<Character, Character> t2s = new HashMap<> ();
        int len = s.length ();
        for (int i = 0; i < len; i++) {
            char x = s.charAt (i);
            char y = t.charAt (i);
            //containsKey返回的是bool get返回的才是值
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put (x,y);
            t2s.put (y,x);
        }
        return true;

    }
    public boolean isIsomorphic2(String s, String t) {
        //indexOf第一次出现的位置
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }


}
