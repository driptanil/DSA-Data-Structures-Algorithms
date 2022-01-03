package com.inclass;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        func(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void func(int[] array) {
        array[0] = 11;
    }
}
