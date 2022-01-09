package com.inclass;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(binary(arr, 0, arr.length - 1, 4));
    }

    static int binary(int[] arr, int start, int end, int target) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                return binary(arr, start, mid - 1, target);
            } else if (arr[mid] < target) {
                return binary(arr, mid + 1, end, target);
            }
            return mid;
        }
        return -1;
    }
}
