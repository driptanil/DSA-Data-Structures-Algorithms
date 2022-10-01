package com.inclass.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    /**
     * Constructor for default ArrayList class
     */
    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    /**
     * Adds element at the last index of the Arraylist
     * @param num
     */
    public void add(int num) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    /**
     * check whether the Arraylist is full or not full
     * @return
     */
    private boolean isFull() {
        return size == data.length;
    }

    /**
     * resizes the old array,
     * creates a new array of double of the size of the initial array,
     * copies all the elements of old array to new array
     */
    public void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    /**
     * removes the last element at last index,
     * by decreasing the size by 1
     * @return
     */
    public int pop() {
        return data[size--];
    }

    /**
     * returns the size of arraylist
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * sets given element at given index
     * @param index
     * @param element
     */
    public void set(int index, int element) {
        data[index] = element;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(Arrays.copyOfRange(data, 0, size)) +
                '}';
    }

    public static void main (String[] args) {
        WildCards custom = new WildCards();
        custom.add(1);
        custom.add(2);
        System.out.println(custom.toString());
    }
}
