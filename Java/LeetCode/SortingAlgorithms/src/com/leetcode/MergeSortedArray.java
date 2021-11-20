package com.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        insertionSort(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }

    static void insertionSort(int[] nums1, int[] nums2, int m, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = i + 1; j >= 0; j--) {
                if (nums1[j] < nums1[j - 1]) {
                    System.out.println(Arrays.toString(nums1));
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
