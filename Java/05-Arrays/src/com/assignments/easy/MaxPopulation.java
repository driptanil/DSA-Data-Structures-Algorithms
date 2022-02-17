package com.assignments.easy;

public class MaxPopulation {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}
        };
        System.out.println(maxPop(arr));
    }

    /*
    Runtime: 1 ms, faster than 80.82% of Java online submissions for Maximum Population Year.
    Memory Usage: 39.9 MB, less than 39.94% of Java online submissions for Maximum Population Year.
     */
    static int maxPop (int[][] arr) {
        int maxdeath = arr[0][1];
        int minbirth = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            if (maxdeath < arr[i][1]) {
                maxdeath = arr[i][1];
            }
            if (minbirth > arr[i][0]) {
                minbirth = arr[i][0];
            }
        }
        int[] year = new int[maxdeath - minbirth + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i][0]; j < arr[i][1]; j++) {
                year[j - minbirth] += 1;
            }
        }
        int max = 0;
        for (int i = 1; i < year.length; i++) {
            if (year[max] < year[i]) {
                max = i;
            }
        }
        return minbirth + max;
    }
}
