package com.inclass;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltFunc {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // last in, first out (LIFO)
        // first in, last out (FILO)

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


        Deque<Integer> deque = new LinkedList<Integer>();
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println();
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
