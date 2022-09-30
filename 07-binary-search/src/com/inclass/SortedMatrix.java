package com.inclass;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int target = 4;
        System.out.println(Arrays.toString(selfSearch(mat, target)));
    }
    /* https://leetcode.com/problems/search-a-2d-matrix (only difference is instead of returning index, return boolean)
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix.
    Memory Usage: 38.2 MB, less than 87.50% of Java online submissions for Search a 2D Matrix.
     */
    static int[] selfSearch(int[][] mat, int target) {
        int sRow = 0;
        int eRow = mat.length - 1;
        int sCol = 0;
        int eCol = mat[0].length - 1;
        // Compairing Target with end element of rows
        while (sRow <= eRow) {
            int iRow = (sRow + eRow) / 2;
            if (mat[iRow][eCol] == target) {
                return new int[] {iRow, eCol};
            } else if (mat[iRow][eCol] > target) {
                if (mat[iRow][sCol] > target) {
                    eRow = iRow - 1;
                } else {
                    // Normal Binary Search in row
                    while (sCol <= eCol) {
                        int iCol = (sCol + eCol) / 2;
                        if (mat[iRow][iCol] == target) {
                            return new int[] {iRow, iCol};
                        } else if (mat[iRow][iCol] > target) {
                            eCol = iCol - 1;
                        } else {
                            sCol = iCol + 1;
                        }
                    }
                    return new int[] {-1, -1};
                }
            } else {
                sRow = iRow + 1;
            }
        }
        return new int[] {-1, -1};
    }
}
