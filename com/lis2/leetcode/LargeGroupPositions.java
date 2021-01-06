package com.lis2.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargeGroupPositions {


    //较大分组的位置 https://leetcode-cn.com/problems/positions-of-large-groups/
    @Test
    public void largeGroupPositions() {
        String s1 = "dd";
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int len = s1.length();
        int num = 1;
        for (int i = 0; i < len; i++) {
            //默认是有一个，这里的i=len-1用的很巧妙，直接把后面的断了
            //原来想着默认是0，循环的时候在加上去，但是在和后一个判断的时候需要判断这个是不是最后一个，最后一个+1会发生越界
             if (i==len-1 || s1.charAt(i) != s1.charAt(i+1)){
                 if (num>=3){
                     ret.add(Arrays.asList(i-num+1,i));
                 }
                 num=1;
             }else {
                 num++;

             }
        }
        System.out.println(ret);
    }
}
