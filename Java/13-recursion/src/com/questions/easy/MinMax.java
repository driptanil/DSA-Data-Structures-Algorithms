package com.questions.easy;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 3, 5, -5, -4, 8, 6};
        System.out.println(min(arr, arr.length));
        System.out.println(max(arr, arr.length));
    }

    static int min(int[] arr, int count) {
        if (count ==  1) {
            return arr[0];
        }
        return Math.min(arr[count - 1], min(arr, count - 1));
    }

    static int max(int[] arr, int count) {
        if (count == 1) {
            return arr[0];
        }
        return Math.max(arr[count - 1], max(arr, count - 1));
    }
}
