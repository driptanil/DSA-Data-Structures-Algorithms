package com.inclass.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main (String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubble(arr, arr.length - 1, 0)));
    }

    static int[] bubble (int[] arr, int i, int j) {
        if (j < i) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                return bubble(arr, i, j + 1);
            }
        } else if (i == 1) {
            return arr;
        }
        return bubble(arr, i - 1, 0);
    }
}
