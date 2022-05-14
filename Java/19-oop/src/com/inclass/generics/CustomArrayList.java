package com.inclass.generics;

import java.util.ArrayList;

public class CustomArrayList {

    // doubling grows exponentially
    // it is taking constant time on an average
    // AMORTISED CONSTANT TIME

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = num; 
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items in new array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        
    }

}
