package com.inclass.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main (String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubble(arr, arr.length - 1, 1)));
    }

    static int[] bubble(int[] arr, int i, int j) {
        if (i == 0) {
            return arr;
        } if (j > i) {
            return bubble(arr, i - 1, 1);
        } if (arr[j - 1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        } return bubble(arr, i, j + 1);
    }
}
