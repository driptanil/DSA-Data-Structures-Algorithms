package com.assignments.easy;

// https://leetcode.com/problems/number-of-good-pairs/

public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(arr));
    }

    /*
    Runtime: 1 ms, faster than 80.75% of Java online submissions for Number of Good Pairs.
    Memory Usage: 42.2 MB, less than 5.10% of Java online submissions for Number of Good Pairs.
     */
    static int numIdenticalPairs(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
