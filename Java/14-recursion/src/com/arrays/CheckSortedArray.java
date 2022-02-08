package com.arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(betterSorted(arr, 0));
    }

    static boolean mySorted (int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return mySorted(arr, index + 1);
        }
        return false;
    }

    static boolean betterSorted (int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && betterSorted(arr, index + 1);
    }
}
