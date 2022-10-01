package com.questions;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        if (target > arr[arr.length - 1]) {
            System.out.println("No Result Found !");
        }
        else {
            System.out.println(ceiling(arr, target));
        }
    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while (start <= end) {
            index = start + (end - start) / 2;
            if (arr[index] == target) {
                return arr[index];
            }
            else if (arr[index] > target) {
                end = index - 1;
            }
            else {
                start = index + 1;
            }
        }
        return arr[start];
    }
}