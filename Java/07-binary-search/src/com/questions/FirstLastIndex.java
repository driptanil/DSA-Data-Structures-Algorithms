package com.questions;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstLastIndex {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selfAttempt()));
        System.out.println(Arrays.toString(solution()));
    }


    /* Self Attempt:
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
    Memory Usage: 42.4 MB, less than 54.92% of Java online submissions for Find First and Last Position of Element in Sorted Array.
     */
    static int[] selfAttempt() {
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;
        int index = firstLastIndex(nums, target);
        int first = firstIndex(nums, target, index);
        int last = lastIndex(nums, target, index);
        return new int[]{first, last};
    }
    static int firstLastIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        while (start <= end) {
            index = start + (end - start) / 2;
            if (nums[index] < target) {
                start = index + 1;
            } else if (nums[index] > target) {
                end = index - 1;
            } else {
                return index;
            }
        }
        return -1;
    }

    static int firstIndex(int[] nums, int target, int index) {
        int temp = index;
        for (int i = index; i >= 0; i--) {
            if (nums[i] != target) {
                return i + 1;
            }
            else {
                temp = i;
            }
        }
        return temp;
    }

    static int lastIndex(int[] nums, int target, int index) {
        int temp = index;
        for (int i = index; 0 <= i && i < nums.length; i++) {
            if (nums[i] != target) {
                return i - 1;
            }
            else{
                temp = i;
            }
        }
        return temp;
    }


    /* Solution:
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
    Memory Usage: 44 MB, less than 28.93% of Java online submissions for Find First and Last Position of Element in Sorted Array.
     */
    static int[] solution() {
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);
        return new int[] {start, end};
    }


    static int binarySearch(int[] nums, int target, boolean firstIndex) {
        int index;
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            index = start + (end - start) / 2;
            if (nums[index] < target) {
                start = index + 1;
            } else if (nums[index] > target) {
                end = index - 1;
            } else {
                ans = index;
                if (firstIndex) {
                    end = index - 1;
                } else {
                    start = index + 1;
                }
            }
        }
        return ans;
    }
}