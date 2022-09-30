package com.inclass;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(arr));
    }

    /* Solution:
    Runtime: 1 ms, faster than 61.26% of Java online submissions for Missing Number.
    Memory Usage: 39.4 MB, less than 68.04% of Java online submissions for Missing Number.
     */
    static int solution(int[] arr) {
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
        return missingNumber(arr);
    }

    static void cycleSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] < arr.length && arr[index] != arr[arr[index]]) {
                System.out.println(Arrays.toString(arr));
                int temp = arr[index];
                arr[index] = arr[arr[index]];
                arr[temp] = temp;
            } else {
                index++;
            }
        }
    }

    static int missingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
}
