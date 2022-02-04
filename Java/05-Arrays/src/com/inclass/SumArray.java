package com.inclass;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/submissions/

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sumArray(arr)));
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
Memory Usage: 44.1 MB, less than 5.52% of Java online submissions for Running Sum of 1d Array.
     */
    static int[] sumArray (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }
}
