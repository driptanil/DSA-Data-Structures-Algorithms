package com.inclass;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(Arrays.toString(shuffle1(arr, arr.length / 2)));
    }

    /* After Taking help form GeeksForGeeks
    Runtime: 6 ms, faster than 5.23% of Java online submissions for Shuffle the Array.
Memory Usage: 45.7 MB, less than 7.19% of Java online submissions for Shuffle the Array.
     */
    static int[] shuffle (int[] arr, int count) {
        for (int i = count - 1; i > 0;  i--) {
            for (int j = i; j < i * 2; j++) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    static int[] shuffle1 (int[] arr, int count) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

        }
        return ans;
    }
}
