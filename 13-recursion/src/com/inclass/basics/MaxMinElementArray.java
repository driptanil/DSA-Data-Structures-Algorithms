package com.inclass.basics;

import java.util.Arrays;

public class MaxMinElementArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3, -5, -4, 8, 6};
        int[] arr2 = {1, 4, 3, -5, -4, 8, 6};
        min(arr1);
        System.out.println();
        max(arr2);
    }

    static int[] remove(int[] arr, int index) {
        int[] newarr = new int[arr.length - 1];
        int i = 0, j = 0;
        while(i < newarr.length) {
            if (i == index) {
                j = i + 1;
            }
            newarr[i] = arr[j];
            i++;
            j++;
        }
        return newarr;
    }

    static int[] min(int[] arr) {
        System.out.println(Arrays.toString(arr));
        if (arr.length == 1) {
            return arr;
        } else if (arr[0] > arr[1]) {
            min(remove(arr, 0));
        } else {
            min(remove(arr, 1));
        }
        return new int[1];
    }

    static int[] max(int[] arr) {
        System.out.println(Arrays.toString(arr));
        if (arr.length == 1) {
            return arr;
        } else if (arr[0] > arr[1]) {
            max(remove(arr, 1));
        } else {
            max(remove(arr, 0));
        }
        return new int[1];
    }
}
