package com.inclass.deque;

import java.util.*;

public class InBuiltDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(4);
        // deque is a doubly ended queue
        // allows insertFirst(), insertLast(), removeFirst(), removeLast()

        System.out.println();
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
