package com.assignments.easy;

import java.util.Arrays;

public class Rotation {
    public static void main (String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] target = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        };
        determinant(matrix, target);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    static void determinant (int[][] matrix, int[][] target) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    matrix[j][k] -= (matrix[j][k] / matrix[i][k]) * matrix[i][k];
                }
            }
        }
    }
}
