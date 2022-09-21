package com.inclass.stack;

import com.inclass.CustomArray;

public class CustomStackArray <T> extends CustomArray<T> {

    public CustomStackArray(int size) {
        super(size);
    }

    public CustomStackArray() {
        super();
    }

    public boolean push (T item) {
        isFull();
        ptr++;
        data[ptr] = item;
        return true;
    }


    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an Empty Stack");
        }
        return data[ptr--];
    }

    public Object peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an Empty Stack");
        }
        return data[ptr];
    }

    public static void main(String[] args) throws Exception {
        CustomStackArray<Integer> stack = new CustomStackArray<>(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.toString());

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }


}
