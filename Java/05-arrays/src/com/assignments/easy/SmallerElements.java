package com.assignments.easy;

import java.util.Arrays;
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/
public class SmallerElements {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(countSmaller(arr)));
    }

    /*
    Runtime: 11 ms, faster than 73.10% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
    Memory Usage: 42.7 MB, less than 10.19% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
     */
    static int[] countSmaller (int[] arr) {
        int[] countArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    ++count;
                }
            }
            countArr[i] = count;
        }
        return countArr;
    }
}
