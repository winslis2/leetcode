package com.lis2.math;

import java.util.ArrayList;

public class Lesson5_1 {
    //已知有4中面额，求10元的组合
    public static void main(String[] args) {
        get(10,new ArrayList<Long>());
    }
    private static long[] reward = {1,2,5,10};
    public static void get(long totalReward,ArrayList<Long> result) {
        if (totalReward==0) {
            System.out.println(result);
            return ;
        }else if (totalReward<0) {
            return ;
        }else {
            for (int i = 0; i < reward.length; i++) {
                ArrayList<Long> newResult = (ArrayList<Long>)result.clone();
                newResult.add(reward[i]);
                get(totalReward-reward[i], newResult);
            }
        }
    }
}
