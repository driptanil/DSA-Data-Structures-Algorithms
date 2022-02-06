package com.assignments.easy;

import java.util.Arrays;

// https://leetcode.com/problems/concatenation-of-array/

public class Concatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(concatenation(nums)));
    }

    /*
    Runtime: 1 ms, faster than 77.99% of Java online submissions for Concatenation of Array.
    Memory Usage: 50.6 MB, less than 5.12% of Java online submissions for Concatenation of Array.
     */
    static int[] concatenation (int[] nums) {
        int[] con = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            con[i] = con[i + nums.length] = nums[i];
        }
        return con;
    }
}
