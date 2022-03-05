package com.questions.easy;

import java.util.Arrays;
// https://www.geeksforgeeks.org/sum-triangle-from-array/
public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        triangle(arr);
    }

    static void triangle(int[] arr) {
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }
        triangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}
