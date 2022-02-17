package com.inclass;

import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        merge(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort (int[] arr, int start, int end) {
        if (end - start == 1) {
            merge(arr, start, end);
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid - 1);
        mergeSort(arr, mid, end);
    }

    static void merge (int[] arr, int start, int end) {
        int i = start;
        while (i < end) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
            i++;
        }
    }
}
