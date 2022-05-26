package com.inclass.easy;

/**
 * <p><b>35. Search Insert Position</b></p>
 * https://leetcode.com/problems/search-insert-position/submissions/
 */
public class SearchIndex {
    public static void main(String[] args) {

    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
     * Memory Usage: 41.8 MB, less than 89.86% of Java online submissions for Search Insert Position.
     * @param arr
     * @param target
     * @return
     */
    static int binarySearch(int[] arr, int target) {
        int end = arr.length - 1;
        if (target > arr[end]) {
            return end + 1;
        }
        int start = 0;
        while (start < end) {
            int index = start + (end - start) / 2;
            if (target == arr[index]) {
                return index;
            } else if (target < arr[index]) {
                end = index;
            } else {
                start = index + 1;
            }
        }
        return start;
    }
}
