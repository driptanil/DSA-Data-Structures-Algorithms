package com.assignments.easy;

// https://leetcode.com/problems/richest-customer-wealth/submissions/

public class Richest {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
        };
        System.out.println(maximumWealth(accounts));
    }

    /*
    Runtime: 1 ms, faster than 45.80% of Java online submissions for Richest Customer Wealth.
    Memory Usage: 43.3 MB, less than 29.58% of Java online submissions for Richest Customer Wealth.
     */
    static int maximumWealth (int[][] accounts) {
        int maxSum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tempSum += accounts[i][j];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }
        return maxSum;
    }
}
