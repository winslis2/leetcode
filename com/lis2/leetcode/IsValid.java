package com.lis2.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

public class IsValid {

    @Test
    public void test() {
        String s = "()";
        System.out.println(isValid(s));
    }

    //https://leetcode-cn.com/problems/valid-parentheses/
    public boolean isValid(String s) {
        if (s.length() % 2 ==1) {
            return false;
        }
        HashMap<Character, Character> shm = new HashMap<>();
        shm.put(')', '(');
        shm.put('}', '{');
        shm.put(']', '[');
        LinkedList<Character> characters = new LinkedList<>();
        for (int i = 0; i <s.length() ; i++) {
        char ch = s.charAt(i);
        if (shm.containsKey(ch)){
            if (characters.isEmpty() || characters.peekLast() != shm.get(ch)){
                return false;
            }
            characters.removeLast();

        }else{
            characters.addLast(ch);
        }
        }
        return characters.isEmpty();
    }
}
