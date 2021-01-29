package com.lis2.base;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class StackDemo {
    //Deque接口地址https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html
    @Test
    public void test1() {
        //Stack官方已经不推荐使用 https://chengfeng96.com/blog/2018/01/20/Java%E4%B8%AD%E7%94%A8Deque%E6%8E%A5%E5%8F%A3%E4%BB%A3%E6%9B%BFStack%E6%8E%A5%E5%8F%A3%E5%AE%8C%E6%88%90%E6%A0%88%E5%8A%9F%E8%83%BD/
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.search(3));
    }

    @Test
    public void test2() {
        //作为Stack使用
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(1);
        ad.addFirst(2);
        ad.addFirst(3);
        ad.removeFirst();
        System.out.println(ad);
    }


    @Test
    public void test3() {
        //作为Queue使用
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offerLast(1);
        ad.offerLast(2);
        ad.offerLast(3);
        ad.pollLast();
        System.out.println(ad);
    }

    @Test
    public void test4() {
        //优先对列
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        pq.offer(2);
        pq.offer(1);
        pq.offer(3);
        System.out.println(pq);
    }
}
