package com.inclass.queue.circular;

import com.inclass.CustomArray;

import java.util.Arrays;

public class CustomCircularQueueArray<T> extends CustomArray<T> {

    int lst = 0;

    public CustomCircularQueueArray() {
        super();
    }

    public CustomCircularQueueArray(int size) {
        super(size);
    }

    @Override
    public boolean isFull() {
        if (data[(lst) % data.length] != null) {
            Object[] duplicate = new Object[data.length * 2];
            int i = 0;
            ptr = (ptr + 1) % data.length;
            do {
                duplicate[i] = data[ptr];
                ptr = (ptr + 1) % data.length;
                i++;
            } while (ptr != lst);
            ptr = -1;
            lst = data.length;
            data = duplicate;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return ptr == - 1 && lst == -1;
    }

    public void add (T val) {
        isFull();
        data[lst] = val;
        lst = (lst + 1) % data.length;
    }

    public Object remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Empty Circular Queue !!!");
        }
        Object temp = data[++ptr];
        data[ptr] = null;
        return temp;
    }

    public Object peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty Circular Queue !!!");
        }
        return data[ptr + 1];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder b = new StringBuilder();
        b.append('[');
        int i = (ptr + 1) % data.length;
        b.append(data[i]);
        do {
            i = (i + 1) % data.length;
            b.append(", ").append(data[i]);
        } while ((i + 1) % data.length != lst);
        return b.append("]").toString();
    }

    public void display() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) throws Exception{
        CustomCircularQueueArray<Integer> list = new CustomCircularQueueArray<>(2);
        list.add(1);
        list.add(2);
       System.out.println(list);
        list.display();
        list.add(3);

       System.out.println(list);
        list.display();
        System.out.println(list.remove());
               System.out.println(list);
        list.display();
        System.out.println(list.peek());

        list.add(4);
               System.out.println(list);
        list.display();

        list.add(5);
               System.out.println(list);
        list.display();

        list.add(6);
       System.out.println(list);
        list.display();
        list.add(7);
       System.out.println(list);
        list.display();
    }

}
