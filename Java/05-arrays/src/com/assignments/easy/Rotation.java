package com.assignments.easy;

import java.util.Arrays;

public class Rotation {
    public static void main (String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int[][] target = new int[3][3];
        // Rotation 90*
        int count = 1;
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[i].length; j++) {
                target[j][target.length - i - 1] = count++;
            }
        }
        System.out.println(rotation90(arr, target));
        for (int i = 0; i < target.length; i++) {
            System.out.println(Arrays.toString(target[i]));
        }


        // Rotation 180*
        count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                target[target.length - i - 1][target[i].length - j - 1] = count++;
            }
        }
        System.out.println(rotation180(arr, target));
        for (int i = 0; i < target.length; i++) {
            System.out.println(Arrays.toString(target[i]));
        }


        count = 1;
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[i].length; j++) {
                target[target[i].length - j - 1][i] = count++;
            }
        }
        System.out.println(rotation270(arr, target));


        for (int i = 0; i < target.length; i++) {
            System.out.println(Arrays.toString(target[i]));
        }
    }

    static boolean rotation0 (int[][] arr, int[][] target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean rotation90 (int[][] arr, int[][] target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target[i][j] != arr[arr.length - j - 1][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean rotation180 (int[][] arr, int[][] target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target[i][j] != arr[arr.length - i - 1][arr.length - j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean rotation270 (int[][] arr, int[][] target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target[i][j] != arr[j][arr.length - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Determine Whether Matrix Can Be Obtained By Rotation.
    Memory Usage: 42.7 MB, less than 9.60% of Java online submissions for Determine Whether Matrix Can Be Obtained By Rotation.
     */
    static boolean rotation (int[][] arr, int[][] target) {
        return rotation90(arr, target) || rotation180(arr, target) || rotation270(arr, target) || rotation0(arr, target);
    }
}
