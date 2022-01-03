package com.inclass;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(arr));
    }

    static void func(int[] array) {
        array[0] = 11;
    }
}
