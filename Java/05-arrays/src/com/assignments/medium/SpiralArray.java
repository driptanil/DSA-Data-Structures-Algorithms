package com.assignments.medium;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/spiral-matrix/submissions/

public class SpiralArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
//                {13, 14, 15, 16},
        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("\nArray: " + Arrays.toString(spiralArray(matrix)));
        System.out.println("\nArrayList: " + spiralArrayList(matrix));
    }

    static int[] spiralArray (int[][] matrix) {
        int maxCol = matrix[0].length;
        int maxRow = matrix.length;
        int minCol = 0;
        int minRow = 0;
        int[] arr = new int[maxRow * maxCol];
        int count = 0;
        while (count < arr.length) {
            // Top Wall
            for (int col = minCol; col < maxCol; col++) {
                arr[count] = matrix[minRow][col];
                count++;
            }
            minRow++;
            // Right Wall
            for (int row = minRow; row < maxRow; row++) {
                arr[count] = matrix[row][maxCol - 1];
                count++;
            }
            maxCol--;
            if (count < arr.length) {
                //Bottom Wall
                for (int col = maxCol - 1; col >= minCol; col--) {
                    arr[count] = matrix[maxRow - 1][col];
                    count++;
                }
                maxRow--;
                // Left Wall
                for (int row = maxRow - 1; row >= minRow; row--) {
                    arr[count] = matrix[row][minCol];
                    count++;
                }
                minCol++;
            }
        }
        return arr;
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
    Memory Usage: 42.8 MB, less than 5.88% of Java online submissions for Spiral Matrix.
     */

    static ArrayList<Integer> spiralArrayList (int[][] matrix) {
        int maxCol = matrix[0].length;
        int maxRow = matrix.length;
        int minCol = 0;
        int minRow = 0;
        ArrayList <Integer> arr = new ArrayList<> (maxRow * maxCol);
        while (arr.size() < matrix.length * matrix[0].length) {
            // Top Wall
            for (int col = minCol; col < maxCol; col++) {
                arr.add(matrix[minRow][col]);
            }
            minRow++;
            // Right Wall
            for (int row = minRow; row < maxRow; row++) {
                arr.add(matrix[row][maxCol - 1]);
            }
            maxCol--;
            if (arr.size() < matrix.length * matrix[0].length) {
                //Bottom Wall
                for (int col = maxCol - 1; col >= minCol; col--) {
                    arr.add(matrix[maxRow - 1][col]);
                }
                maxRow--;
                // Left Wall
                for (int row = maxRow - 1; row >= minRow; row--) {
                    arr.add(matrix[row][minCol]);
                }
                minCol++;
            }
        }
        return arr;
    }
}
