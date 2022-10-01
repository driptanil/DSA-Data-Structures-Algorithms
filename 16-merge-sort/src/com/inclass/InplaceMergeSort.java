package com.inclass;

import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        mergeSort(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort (int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start + 1) / 2;
        mergeSort(arr, start, mid - 1);
        mergeSort(arr, mid, end);
        merge(arr, start, end);
    }

    static void merge (int[] arr, int start, int end) {
        int mid = start + (end - start + 1) / 2;
        while (start < mid && mid <= end) {
            if (arr[start] > arr[mid]) {
                for (int i = mid - 1; i >= start; i--) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
                start++;
                mid++;
            } else {
                start++;
            }
        }
    }
}
