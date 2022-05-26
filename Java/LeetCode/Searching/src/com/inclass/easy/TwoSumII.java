package com.inclass.easy;

import java.util.Arrays;

/**
 * <p><b>167. Two Sum II - Input Array Is Sorted</b></p>
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 4};
        int target = 6;
        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }

    /**
     * <b>Time Limit Exceeded</b>
     * @param arr
     * @param target
     * @return
     */
    static int[] linearSearch(int[] arr, int target) {
        int[] range = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    range[0] = i + 1;
                    range[1] = j + 1;
                    return range;
                }
            }
        }
        return range;
    }

    /**
     * Runtime: 7 ms, faster than 11.58% of Java online submissions for Two Sum II - Input Array Is Sorted.
     * Memory Usage: 44.8 MB, less than 94.05% of Java online submissions for Two Sum II - Input Array Is Sorted.
     * @param arr
     * @param target
     * @return
     */
    static int[] binarySearch(int[] arr, int target) {
        int[] range = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int start = i + 1, end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[i] + arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[i] + arr[mid]) {
                    end = mid - 1;
                } else {
                    range[0] = i + 1;
                    range[1] = mid + 1;
                    return range;
                }
            }
        }
        return range;
    }
}
