package com.inclass;

import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {
        int [][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 4;
        System.out.println(Arrays.toString(search(mat, target)));
    }

    static int[] search(int[][] mat, int target) {
        int row = 0;
        int col = mat.length - 1;
        while (row < mat.length && col >= 0) {
            if (target == mat[row][col]) {
                return new int[]{row, col};
            } else if (target > mat[row][col]){
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
