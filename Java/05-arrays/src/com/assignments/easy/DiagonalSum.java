package com.assignments.easy;

// https://leetcode.com/problems/matrix-diagonal-sum

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {7, 3, 1, 9},
                {3, 4, 6, 9},
                {6, 9, 6, 6},
                {9, 5, 8, 5}
        };
        System.out.println(diagonal(matrix));
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Matrix Diagonal Sum.
    Memory Usage: 42 MB, less than 65.17% of Java online submissions for Matrix Diagonal Sum.
     */
    static int diagonal (int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }
}
