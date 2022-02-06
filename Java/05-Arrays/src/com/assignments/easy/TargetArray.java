package com.assignments.easy;

import java.util.Arrays;

// https://leetcode.com/problems/create-target-array-in-the-given-order/

public class TargetArray {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 2 ,3, 4};
        int[] index = new int[] {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(target(arr, index)));
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Create Target Array in the Given Order.
    Memory Usage: 40.5 MB, less than 12.36% of Java online submissions for Create Target Array in the Given Order.
     */
    static int[] target (int[] arr, int[] index) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > index[i]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        return arr;
    }
}
