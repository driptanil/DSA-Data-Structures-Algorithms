package com.inclass;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}
