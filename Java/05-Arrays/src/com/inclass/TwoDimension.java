package com.inclass;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //        int[3][] arr = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] arr2 = new int[3][3];
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = in.nextInt();
            }
        }
        for (int[] row : arr2){
            System.out.println(Arrays.toString(row));
        }
    }
}
