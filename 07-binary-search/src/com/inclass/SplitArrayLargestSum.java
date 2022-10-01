package com.inclass;

// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = new int[] {7, 2, 5, 10, 8};
        int m = 3;
    }

    static int splitArray (int[] arr, int m) {
        int start = arr[0];
        int end = arr[0];
        for (int i = 1; i < arr.length; i++) {
            end += arr[i];
            if (start < arr[i]) {
                start = arr[i];
            }
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
        }

        return end;
    }
}
