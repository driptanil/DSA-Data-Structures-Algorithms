package com.inclass.arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3, 4};
        int target = 6;
        System.out.println(rotatedBinary(arr, target, 0, arr.length));
    }

    static int rotatedBinary (int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return target;
        } else if (arr[mid] > arr[start]) {
            if (arr[mid] < target) {
                return rotatedBinary(arr, target, mid + 1, end);
            }
            return rotatedBinary(arr, target, start, mid - 1);
        } else {
            if (arr[mid] < target) {
                return rotatedBinary(arr, target, start, mid - 1);
            }
            return rotatedBinary(arr, target, mid + 1, end);
        }
    }
}
