package com.questions;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 * <a href="https://leetcode.com/problems/implement-queue-using-stacks">...</a>
 */
public class QueueUsingStacks {

    private static Stack<Integer> first;
    private static Stack<Integer> second;

    public class InsertOptimised {

        public InsertOptimised() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add (int item) {
            first.push(item);
        }

        public int remove () throws Exception {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int pop = second.pop();
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return pop;
        }

        public int peek () throws Exception {
            while(!first.isEmpty()) {
                second.push(first.pop());
            }
            int top = second.pop();
            first.push(top);
            while(!second.isEmpty()) {
                first.push(second.pop());
            }
            return top;
        }

        public boolean isEmpty () throws Exception {
            return first.isEmpty();
        }
    }

    public static class RemoveOptimised {
        public RemoveOptimised() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void push(int item) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            second.push(item);
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
        }

        public int pop() {
            return first.pop();
        }

        public int peek() {
            return first.peek();
        }

        public boolean isEmpty() {
            return first.isEmpty();
        }
    }

    public static void main(String[] args) {
        RemoveOptimised queue = new RemoveOptimised();

        queue.push(5);
        System.out.println(queue.peek());

    }

}
