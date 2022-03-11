package com.assignments.easy;

import java.util.Arrays;

// https://leetcode.com/problems/transpose-matrix/

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
//                {13, 14, 15, 16}
        };
        int[][] trans = transpose(matrix);
        for (int i = 0; i < trans.length; i++) {
            System.out.println(Arrays.toString(trans[i]));
        }
    }

    /*
    Runtime: 1 ms, faster than 58.19% of Java online submissions for Transpose Matrix.
    Memory Usage: 49.1 MB, less than 5.73% of Java online submissions for Transpose Matrix.
     */
    static int[][] transpose (int[][] matrix) {
        int[][] trans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
}