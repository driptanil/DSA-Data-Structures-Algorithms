package com.inclass.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(insertion(arr, 2, 1)));
    }

    static int[] insertion(int[] arr, int i, int j) {
        if (i > arr.length) {
            return arr;
        } if (j == 0) {
            return insertion(arr, i + 1, i);
        } if (arr[j] < arr[j - 1]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }
        return insertion(arr, i, j - 1);
    }
}
