package com.inclass;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 2, 1, 6};
        System.out.println(Arrays.toString(arr));
//        startPivot(arr, 0, arr.length - 1);
//        endPivot(arr, 0, arr.length - 1);
        midPivot(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void endPivot (int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        print(arr, start, end);
        int startTemp = start;
        int pivot = end;
        while (start < pivot) {
            if (arr[start] > arr[pivot]) {
                int temp = arr[start];
                for (int i = start; i < pivot; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[pivot--] = temp;
            } else {
                start++;
            }
        }
        endPivot(arr, startTemp, pivot - 1);
        endPivot(arr, pivot, end);
    }


    static void startPivot (int[] arr ,int start, int end) {
        if (start >= end) {
            return;
        }
        print(arr, start, end);
        int endTemp = end;
        int pivot = start;
        while (end > pivot) {
            if (arr[end] < arr[pivot]) {
                int temp = arr[end];
                for (int i = end - 1; i >= pivot; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[pivot++] = temp;
            } else {
                end--;
            }
        }
        startPivot(arr, start, pivot);
        startPivot(arr, pivot + 1, endTemp);
    }

    static void midPivot (int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int startTemp = start;
        int endTemp = end;
        int pivot = start + (end - start + 1) / 2;
        while (start < pivot) {
            if (arr[start] > arr[pivot]) {
                int temp = arr[start];
                for (int i = start; i < pivot; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[pivot--] = temp;
            } else {
                start++;
            }
        }
        print(arr, startTemp, endTemp);
        while (end > pivot) {
            if (arr[end] < arr[pivot]) {
                int temp = arr[end];
                for (int i = end - 1; i >= pivot; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[pivot++] = temp;
            } else {
                end--;
            }
        }
        print(arr, startTemp, endTemp);
        midPivot(arr, startTemp, pivot - 1);
        midPivot(arr, pivot, endTemp);
    }


    static void print (int[] arr, int start, int end) {
        System.out.print("[");
        for (int i = start; i < end; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[end] + "]");
    }
}
