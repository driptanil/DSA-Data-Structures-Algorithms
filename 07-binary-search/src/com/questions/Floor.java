package com.questions;

import java.util.Scanner;

public class Floor {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        Scanner in =new Scanner(System.in);
        int target = in.nextInt();
        if (target < arr[0]) {
            System.out.println("No Result Found !");
        }
        else {
            System.out.println(floor(arr, target));
        }
    }
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index;
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
        return arr[end];
    }
}
