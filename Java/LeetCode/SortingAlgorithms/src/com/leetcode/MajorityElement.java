package com.leetcode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4};
        System.out.println(majorElement(arr));
    }
    static int majorElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        int count = 1;
        int element = arr[0];
        int tempElement = element;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (element == arr[i]) {
                count++;
            } else {
                if (max < count) {
                    tempElement = arr[i - 1];
                    max = count;
                }
                element = arr[i];
                count = 1;
            }
        }
        if (max < count) {
            tempElement = arr[arr.length - 1];
            max = count;
        }
        return tempElement;
    }
}
