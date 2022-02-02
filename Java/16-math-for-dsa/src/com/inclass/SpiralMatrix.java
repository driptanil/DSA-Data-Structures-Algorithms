package com.inclass;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        spiral(matrix);
    }

    static void spiral(int[][] matrix) {
        int xmin = matrix[0].length;
        int ymin = matrix.length - 1;
        int xcount = 0;
        int ycount = 0;
        while(ymin > 0) {
            int xtemp = (int) (xcount);
            int ytemp = (int) (ycount);
            for (int x = 0; x < xmin; x++) {
                if (xcount % 2 == 0) {
                    System.out.print(matrix[matrix.length - ymin - ytemp - 1][xtemp + x] + "  ");
                } else {
                    System.out.print(matrix[ymin + 1][matrix[0].length - x - 2 - xtemp] + "  ");
                }
            }
            xmin -= 1;
            xcount += 1;
            xtemp = (int) (xcount);
            ytemp = (int) (ycount);
            for (int y = 0; y < ymin; y++) {
                if (ycount % 2 != 0) {
                    System.out.print(matrix[matrix.length - y - ytemp - 2][matrix[0].length - xmin - xtemp - 1] + "  ");
                } else {
                    System.out.print(matrix[y + ytemp + 1][xmin] + "  ");
                }
            }
            ymin -= 1;
            ycount += 1;
        }
    }
}
