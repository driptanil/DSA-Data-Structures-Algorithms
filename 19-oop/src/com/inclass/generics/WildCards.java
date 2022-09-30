package com.inclass.generics;

import java.util.Arrays;

/**WILDCARDS:
 * it only allows classes or subclasses of the given type.
 *
 * <p>Syntax: <? extends class></p>
 * @param <T>
 */
public class WildCards<T extends Number>{

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    /**
     * Constructor for default ArrayList class
     */
    public WildCards() {
        this.data = new Object[DEFAULT_SIZE];
    }

    /**
     * Adds element at the last index of the Arraylist
     * @param num
     */
    public void add(Object num) {
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
        Object[] temp = new Object[data.length * 2];

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
    public Object pop() {
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
    public void set(int index, Object element) {
        data[index] = element;
    }

    @Override
    public String toString() {
        return "GenericArrayList{" +
                "data=" + Arrays.toString(Arrays.copyOfRange(data, 0, size)) +
                '}';
    }

    public static void main (String[] args) {
        WildCards<Integer> custom = new WildCards<>();
        custom.add(1);
        custom.add(2);
        System.out.println(custom.toString());

        /*WildCards<String> custom2 = new WildCards<>();
        // Error: String class does not extend Number class
        */


    }
}
