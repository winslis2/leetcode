package com.lis2.leetcode;

import org.junit.Test;

public class CoinChange {
    @Test
    public void coinChangeTest() {
        int[] coins = new int[]{1, 5};
        int amount = 11;

        System.out.println(coinChange(0, coins, amount));
    }

    //idxCoin 某个硬币的下标
    private int coinChange(int idxCoin, int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (idxCoin < coins.length && amount > 0) {
            int maxVal = amount / coins[idxCoin];//某个硬币出现的最大次数
            int minCost = Integer.MAX_VALUE;
            for (int x = 0; x <= maxVal; x++) {
                if (amount >= x * coins[idxCoin]) {
                    int res = coinChange(idxCoin + 1, coins, amount - x * coins[idxCoin]);
                    if (res != -1) {
                        minCost = Math.min(minCost, res + x);
                    }
                }
            }
            return (minCost == Integer.MAX_VALUE)? -1: minCost;
        }
        return -1;
    }
}
