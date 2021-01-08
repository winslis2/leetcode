package com.lis2.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class MinCostClimbingStairs {
    @Test
    public void test() {
        int[] cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        //           dp       [0, 0, 0,0,0, 0 ,0,0,  0,0,0,0]
        int[] cost1 = new int[]{10, 15, 20};
        int i = minCostClimbingStairs (cost1);
        System.out.println (i);
    }

    //https://leetcode-cn.com/problems/min-cost-climbing-stairs/
    //建立模型关系
        //爬楼梯所消耗的体力值肯定是越来越多的，关键是走一步还是走两步，只需要找出两个的最小值
        //建立数组保存每个阶段的体力值，返回最后一项即是最大值

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= n; i++) {//是<=n
            dp[i] = Math.min (dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        System.out.println (Arrays.toString (dp));
        return dp[n];
    }

    //使用滚动数组
    public int minCostClimbingStairs1(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 0;
        int pre = 0;
        int curr = 0;
        for (int i = 2; i <= n; i++) {//是<=n
            int next = Math.min (curr+cost[i-1], pre+cost[i-2]);
            pre = curr;
            curr = next;
        }
        return curr;
    }
}
