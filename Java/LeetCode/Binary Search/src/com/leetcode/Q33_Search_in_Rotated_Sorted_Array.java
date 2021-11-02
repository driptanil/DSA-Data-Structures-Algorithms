package com.leetcode;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class Q33_Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
    Memory Usage: 38.3 MB, less than 72.81% of Java online submissions for Search in Rotated Sorted Array.
     */
    static int leetCode(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int index = start + (end - start) / 2;
            if (arr[index] == target) {
                return index;
            } else if (arr[start] <= arr[index]) {
                if (target >= arr[start] && target < arr[index]) {
                    end = index - 1;
                } else {
                    start = index + 1;
                }
            } else {
                if (target > arr[index] && target <= arr[end]) {
                    start = index + 1;
                } else {
                    end = index - 1;
                }
            }
        }
        return -1;
    }
}
