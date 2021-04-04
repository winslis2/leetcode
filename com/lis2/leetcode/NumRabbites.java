package com.lis2.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NumRabbites {

    @Test
    public void test() {
        int[] answer = {1, 1, 2};
        int ans = numRabbits(answer);
    }
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int y : answers) {
            count.put(y, count.getOrDefault(y, 0) + 1);
        }
        int ans = 0;
        //x/y向上取整的方法，x+y-1/y
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int y = entry.getKey(), x = entry.getValue();
            ans += (x + y) / (y + 1) * (y + 1);
        }
        return ans;
    }

}
