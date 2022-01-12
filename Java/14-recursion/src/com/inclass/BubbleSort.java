package com.inclass;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 3, 2, 1};
        bubble(arr, 1, arr.length);
    }

    static void bubble(int[] arr, int count, int count2) {
        if (count2 > 1) {
            if (count < count2) {
                if (arr[count] < arr[count - 1]) {
                    int temp = arr[count];
                    arr[count] = arr[count - 1];
                    arr[count - 1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
                bubble(arr, count + 1, count2);
            }
            bubble(arr, 1, count2 - 1);
        }
    }
}