package com.assignments.easy;

import com.inclass.Array;

import java.util.Arrays;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix

public class CellsWithOddValues {
    public static void main(String[] args) {
        System.out.println(cellsWithOdd(2, 2, new int[][] {{1, 1}, {0, 0}}));
    }

    /*
    Runtime: 3 ms, faster than 35.29% of Java online submissions for Cells with Odd Values in a Matrix.
    Memory Usage: 42.1 MB, less than 9.73% of Java online submissions for Cells with Odd Values in a Matrix.
     */
    static int cellsWithOdd (int m, int n, int[][] index) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < index.length; i++) {
            // Row
            for (int j = 0; j < arr[index[i][0]].length; j++) {
                arr[index[i][0]][j] += 1;
            }
            for (int j = 0; j < arr.length; j++) {
                arr[j][index[i][1]] += 1;
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
