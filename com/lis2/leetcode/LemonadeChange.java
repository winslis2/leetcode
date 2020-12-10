package com.lis2.leetcode;

import org.junit.Test;

//柠檬水找零 https://leetcode-cn.com/problems/lemonade-change/
public class LemonadeChange {

    public static void main(String[] args) {

    }

    @Test
    public void test() {
        int[] customer = {10,10,5,5,20};
        boolean b = lemonadeChange (customer);
        System.out.println (b);
    }

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills){
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }else {
                    five--;
                    ten++;
                }
            } else {
                if (five>=1 && ten>=1) {
                    five--;
                    ten--;
                }else if(five >= 3) {
                    five -=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
