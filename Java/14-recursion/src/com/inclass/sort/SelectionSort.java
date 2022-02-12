package com.inclass.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 3};
        System.out.println(Arrays.toString(selection(arr, arr.length - 1, arr.length - 1, arr.length - 2)));
    }

    static int[] selection (int[] arr, int i, int max, int maxCount) {
        if (maxCount >= 0) {
            if (arr[max] < arr[maxCount]) {
                return selection(arr, i, maxCount, maxCount - 1);
            }
            return selection(arr, i, max, maxCount - 1);
        } else if (i >= 1)  {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            return selection(arr, i - 1, i - 1, i - 2);
        }
        return arr;
    }
}
