package com.questions;

// https://leetcode.com/problems/median-of-two-sorted-arrays/

public class SearchInsertPosition {
    public static void main(String[] args) {

    }
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
    Memory Usage: 40.6 MB, less than 22.25% of Java online submissions for Search Insert Position.
    */
    static int insertIndex(int[] arr, int target) {
        int end = arr.length - 1;
        if (target > arr[end]) {
            return end + 1;
        }
        int start = 0;
        while (start < end) {
            int index = start + (end - start) / 2;
            if (target == arr[index]) {
                return target;
            } else if (target < index) {
                end = index;
            } else {
                start = index + 1;
            }
        }
        return start;
    }
}

