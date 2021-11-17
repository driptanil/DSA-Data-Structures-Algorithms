package com.inclass;

import java.util.Arrays;

public class CycleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int index = 0;
        while(index < arr.length) {
            if (arr[index] != arr[arr[index] - 1]) {
                int temp = arr[index];
                arr[index] = arr[arr[index] - 1];
                arr[temp - 1] = temp;
            } else {
                index++;
            }
        }
    }
}
