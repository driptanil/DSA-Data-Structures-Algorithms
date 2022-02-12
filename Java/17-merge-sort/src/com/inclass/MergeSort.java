package com.inclass;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 9 ,1, 3, 5, 2, 4};
        System.out.println(Arrays.toString(merge(arr, 0, arr.length - 1)));
    }

    static int[] merge (int[] arr) {
        int mid = (arr.length - 1) / 2;
        if (mid == 0) {
            return arr;
        }
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid + 1, arr.length - 1));

        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[i]) {

            }
        }
    }
}
