package com.questions.easy;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 6, 7, 8, 9, 10};
        int target = 10;
        System.out.println(inplace(arr, target, 0, arr.length - 1));
        System.out.println(newplace(arr, target));
    }

    static int inplace(int[] arr, int target, int start, int end) {
        if (start > end) {
            return Integer.MAX_VALUE;
        } int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return arr[mid];
        } if (target > arr[mid]) {
            return inplace(arr, target, mid + 1, end);
        } return inplace(arr, target, start, mid);
    }

    static int newplace(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int mid = arr.length / 2;
        if (target == arr[mid]) {
            return arr[mid];
        } if (target > arr[mid]) {
            return newplace(Arrays.copyOfRange(arr, mid + 1, arr.length), target);
        } return newplace(Arrays.copyOfRange(arr, 0, mid), target);
    }
}
