package com.inclass;

import java.util.Arrays;

public class Search2D {

    public static void main(String[] args) {
        int [][] arr ={
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
//        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(findMax(arr));
    }

    // search target in array: return index
    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] {-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    // finds maximum number in array
    static int findMax(int[][] arr) {
        int max =arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
}
