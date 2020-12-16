package com.lis2.leetcode;

import com.sun.source.tree.BinaryTree;
import org.junit.Test;

import javax.swing.tree.TreeNode;

public class JudgeCircle {

    @Test
    public void test() {
        String string = "UUDDL";
        Boolean bloo = judgeCircle (string);
        System.out.println (bloo);
    }

    //机器人是否返回原点 https://leetcode-cn.com/problems/robot-return-to-origin/
    public Boolean judgeCircle(String moves) {
        int RL = 0;
        int UD = 0;
        int length = moves.length ();
        for (int i = 0; i < length; i++) {
            char c = moves.charAt (i);
            switch (c) {
                case 'R':
                    RL++;
                    break;
                case 'L':
                    RL--;
                    break;
                case 'U':
                    UD++;
                    break;
                case 'D':
                    UD--;
                    break;
            }
        }
        return (RL==0 && UD==0);
    }
}
