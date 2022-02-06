package com.assignments.easy;

// https://leetcode.com/problems/find-the-highest-altitude/

public class HighestAlt {
    public static void main(String[] args) {
        int[] arr = {-5, 1, 5, 0, -7};
        System.out.println(highest(arr));
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Highest Altitude.
    Memory Usage: 42.1 MB, less than 5.07% of Java online submissions for Find the Highest Altitude.
     */
    static int highest (int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
