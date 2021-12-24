package com.inclass;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 8;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int index = start + (end - start) / 2;
        if (start < end) {
            return -1;
        } else if (target < arr[index]) {
            return binarySearch(arr, target, start, index - 1);
        } else if (target > arr[index]) {
            return binarySearch(arr, target, index + 1, end);
        } else {
            return index;
        }
    }
}
