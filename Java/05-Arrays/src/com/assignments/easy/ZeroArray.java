package com.assignments.easy;

import java.util.Arrays;

public class ZeroArray {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(zeroArray(n)));
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Find N Unique Integers Sum up to Zero.
    Memory Usage: 41.2 MB, less than 15.81% of Java online submissions for Find N Unique Integers Sum up to Zero.
     */
    static int[] zeroArray (int n) {
        int[] arr = new int[n];
        for (int i = (arr.length + 1) / 2; i < arr.length; i++) {
            arr[i] = i;
            arr[arr.length - i - 1]  = -i;
        }
        return arr;
    }
}
