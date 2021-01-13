package com.lis2.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        //放到数组中，然后反转数组   ---自己的想法，转换比较麻烦
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while (curr!=null){
            stack.push(curr);
            curr = curr.next;
        }
        int len = stack.size();
        int[] ints = new int[len];
        for (int i = 0; i <len ; i++) {
            ints[i] = stack.pop().val;
        }
        return ints;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }