package com.inclass.stack;

import java.util.Stack;

public class InBuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // last in, first out (LIFO)
        // first in, last out (FILO)
        // like insertFirst() in linked list, head points to the last element added

        stack = reverse(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

    static Stack<Integer> reverse(Stack<Integer> stack) {
        Stack<Integer> reversed = new Stack<>();
        while (!stack.isEmpty()) {
            reversed.push(stack.pop());
        }
        return reversed;
    }
}
