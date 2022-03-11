package com.inclass;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr2D = new int[3][];
        print2D(arr2D);
        arr2D = new int[][] {{0, 0, 1, 0}, {0, 1, 0}, {1, 0}};
        print2D(arr2D);
//        for (int row = 0; row < arr2.length; row++) {
//            for (int col = 0; col < arr2[row].length; col++) {
//                arr2[row][col] = in.nextInt();
//            }
//        }
    }
    static void print2D(int[][] arr2D) {
        for (int[] row : arr2D){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
