package com.questions;

public class TargetMountainArray {

    // https://leetcode.com/problems/find-in-mountain-array/

    public static void main(String[] args) {
        System.out.println(selfAttempt());
    }

    /* Self Attempt :
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Find in Mountain Array.
    Memory Usage: 41 MB, less than 23.03% of Java online submissions for Find in Mountain Array.
     */
    static int selfAttempt () {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peak = targetIndex(arr, target);
        return BinarySearch(arr, target, peak);
    }

    static int targetIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int BinarySearch(int[] arr, int target, int peak) {
        int start = 0;
        int end = peak;
        while (start <= end) {
            int index = start + (end - start) / 2;
            if (target < arr[index]) {
                end = index - 1;
            } else if (target > arr[index]) {
                start = index + 1;
            } else {
                return index;
            }
        }
        start = peak + 1;
        end = arr.length - 1;
        while (start <= end) {
            int index = start + (end - start) / 2;
            if (target > arr[index]) {
                end = index - 1;
            } else if (target < arr[index]) {
                start = index + 1;
            } else {
                return index;
            }
        }
        return -1;
    }
}
