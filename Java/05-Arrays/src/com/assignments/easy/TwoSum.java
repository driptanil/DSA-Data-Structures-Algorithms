package com.assignments.easy;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 11};
        int target = 14;
    }
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum.
    Memory Usage: 44.7 MB, less than 23.91% of Java online submissions for Two Sum.
     */
    static int[] answer (int[] nums, int target) {
        for (int w = 1; w < nums.length; w++) {
            for (int x = w; x < nums.length; x++) {
                if (nums[x] + nums[x - w] == target) {
                    return new int[]{x - w, x};
                }
            }
        }
        return null;
    }

    /*
    Runtime: 91 ms, faster than 19.66% of Java online submissions for Two Sum.
    Memory Usage: 44.7 MB, less than 23.91% of Java online submissions for Two Sum.
     */
    static int[] self (int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
