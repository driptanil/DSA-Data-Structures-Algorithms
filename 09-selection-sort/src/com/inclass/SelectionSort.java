package com.inclass;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
//        maxSelectionSort(arr);
        minSelectionSort(arr);
    }

    static void maxSelectionSort(int[] arr) {
        int count = arr.length - 1;
        while (count > 0) {
            int maxIndex = 0;
            for (int i = 1; i <= count; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            if (count != maxIndex) {
                int temp = arr[count];
                arr[count] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
            System.out.println(Arrays.toString(arr));
            count--;
        }
    }

    static void minSelectionSort(int[] arr) {
        int count = 0;
        while (count < arr.length - 1) {
            int minIndex = count;
            for (int i = count + 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            if (count != minIndex) {
                int temp = arr[count];
                arr[count] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println(Arrays.toString(arr));
            count++;
        }
    }
}
