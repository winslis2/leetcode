package com.lis2.leetcode;

import org.junit.Test;

public class FindNumberIn2DArray {

    @Test
    public void test() {
        int[][] numTest = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 34}
        };
        System.out.println(findNumberIn2DArray(numTest, 5));
    }
//剑指 Offer 04. 二维数组中的查找
// https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix==null || matrix.length==0 || matrix[0].length==0){
            return false;
        }
        //线性查找
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns-1;
        while (row <rows && column>=0){
            int num = matrix[row][column];
            if ( num == target) {
                return true;
            }else if (num<target){
                row++;
            }else{
                column--;
            }

        }
        return false;
    }
}

