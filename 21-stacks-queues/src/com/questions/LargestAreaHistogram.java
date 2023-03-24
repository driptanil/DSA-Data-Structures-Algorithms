package com.questions;

import java.util.Stack;

public class LargestAreaHistogram {

    public static void main(String[] args) {
        int[] arr = new int[]{};
        System.out.println(maxArea(arr));
    }

    static int maxArea(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = i;
            int right = i;

            while (left >= 0 && arr[i] <= arr[left]) {
                left--;
            }

            while (right < arr.length && arr[i] <= arr[right]) {
                right++;
            }

            if ((right - left - 1) * arr[i] > max) {
                max = (right - left - 1) * arr[i];
            }
        }
        return max;
    }

}
