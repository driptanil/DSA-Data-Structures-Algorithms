package com.inclass;

import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int count = 0;
        System.out.println(Arrays.toString(sum(arr, count)));
    }

    static int[] sum(int[] arr, int i) {
        System.out.println(Arrays.toString(arr));
        if (arr.length == 2) {
            return pop(arr);
        } else if (i >= arr.length - 1) {
            arr = pop(arr);
            i = 0;
        }
        arr[i] += arr[i + 1];
        return sum(arr, i + 1);
    }

    static int[] pop(int[] arr) {
        int[] newarr = new int[arr.length - 1];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }
}
