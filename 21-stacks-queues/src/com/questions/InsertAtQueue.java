package com.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class InsertAtQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(5);
        queue.add(6);
        System.out.println(queue);

        insertAt(queue, 2, 5);

    }

    static void insertAt(Queue<Integer> queue, Integer index, Integer value) {
        Queue<Integer> temp = new LinkedList<>();
        for (int i = 0; i <= index; i++) {
            temp.add(queue.remove());
        }
        temp.add(value);

        for(int i = index - 1; i < queue.size(); i++) {
            temp.add(queue.remove());
        }
        System.out.println(temp);
    }
}
