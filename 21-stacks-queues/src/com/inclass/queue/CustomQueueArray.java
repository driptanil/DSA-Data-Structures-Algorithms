package com.inclass.queue;

import com.inclass.CustomArray;

public class CustomQueueArray<T> extends CustomArray<T> {

    public CustomQueueArray(int size) {
        super(size);
    }

    public CustomQueueArray() {
        super();
    }

    public boolean add (T item) {
        if (isFull()) {
            System.out.println("Stack is Full !!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public Object remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an Empty Stack");
        }
        Object val = data[0];
        for (int i = 0; i < ptr; i++) {
            data[i] = data[i + 1];
        }
        ptr--;
        return val;
    }

    public Object peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an Empty Stack");
        }
        return data[0];
    }

    public static void main(String[] args) throws Exception{
        CustomQueueArray<Integer> queue = new CustomQueueArray<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.toString());

        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }

}
