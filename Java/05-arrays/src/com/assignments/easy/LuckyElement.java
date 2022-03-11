package com.assignments.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class LuckyElement {
    public static void main(String[] args) {
        // [[3,6],[7,1],[5,2],[4,8]]
        int[][] matrix = {
                /* {3, 6},
                {7, 1},
                {5, 2},
                {4, 8} */
                /* {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} */
                {41205,87385},{71957,59065},{57152,61601}
        };
        System.out.println(lucky(matrix));
    }

    static ArrayList<Integer> lucky (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>(4);
        int maxCount = -1;
        for (int i = 0; i < matrix[0].length; i++) {
            int tempCount = maxCount;
            int maxSum = matrix[i][0];
            for (int j = 0; j < matrix.length; j++) {
                if (tempCount == -1 || maxSum < matrix[j][i]) {
                    maxSum = matrix[j][i];
                    tempCount = j;
                }
            }
            if (maxCount != -1 && maxCount != tempCount) {
                return list;
            }
            maxCount = tempCount;
        }
        list.add(matrix[maxCount][0]);
        for (int i = 1; i < matrix[maxCount].length; i++) {
            if (matrix[maxCount][i] < list.get(0)) {
                list.set(0, matrix[maxCount][i]);
            }
        }
        return list;
    }
}
