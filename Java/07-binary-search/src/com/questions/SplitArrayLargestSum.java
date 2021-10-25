package com.questions;

// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    static int solution() {
        int[] arr = {1, 1, 1, 1, 10};
        int m = 2;
    }

    static int splitArray(int[] arr, int m) {
        int sum = 0;
        int limit = (sum(arr) + peak(arr)) / m;
        for (int i = 0; i < arr.length; i++) {

        }
    }

    static int sum(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int peak(int[] arr) {
        int peak = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > peak) {
                peak = arr[i];
            }
        }
        return peak;
    }
}


