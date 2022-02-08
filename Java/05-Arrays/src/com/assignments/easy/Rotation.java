package com.assignments.easy;

public class Rotation {
    public static void main (String[] args) {
        int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] target = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        };

    }

    static boolean transpose (int[][] matrix, int[][] target) {
        int option = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; i++) {
                if (matrix[j][i] != target[i][j]) {
                    break;
                }
            }
        }
        return false;
    }
}
