package com.assignments.easy;

import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/

public class PermutationArray {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    /*
    Runtime: 1 ms, faster than 98.83% of Java online submissions for Build Array from Permutation.
    Memory Usage: 53.5 MB, less than 6.48% of Java online submissions for Build Array from Permutation.
     */
    static int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for (int i = 0; i <= nums.length / 2; i++) {
            ans[i] = nums[nums[i]];
            ans[ans.length - i - 1] = nums[nums[nums.length - i - 1]];
        }
        return ans;
    }
}
