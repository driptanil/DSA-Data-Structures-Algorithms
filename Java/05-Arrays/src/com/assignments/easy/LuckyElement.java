package com.assignments.easy;

import java.util.ArrayList;

public class LuckyElement {
    public static void main(String[] args) {
        // [[3,6],[7,1],[5,2],[4,8]]
        int[][] matrix = {
                {3, 6},
                {7, 1},
                {5, 2},
                {4, 8}
        };
        System.out.println(lucky(matrix));
    }

    static ArrayList<Integer> lucky (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>(4);
        for (int i = 0; i < matrix.length; i++) {
            int maxCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxCol < matrix[j][i]) {
                    maxCol = matrix[j][i];
                }
            }
            if (list.get(i) == null || list.get(i) < maxCol) {
                list.add(maxCol);
            }
        }
        return list;
    }
}
