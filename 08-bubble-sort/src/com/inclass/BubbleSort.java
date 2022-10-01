package com.inclass;

/*
    Bubble sort is also known as Exchange or Sinking Sort.
    Bubble sort is an inplace sorting algorithm
*/

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubbleSort(int[] arr) {
        int count = arr.length - 1;
        int check = 0;
        while (count > 0) {
            boolean sorted = false;
            for (int i = 0; i < count; i++) {
                check++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
            count--;
        }
        System.out.println(check);
    }
}
