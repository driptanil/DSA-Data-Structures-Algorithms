package com.inclass;

import java.util.Arrays;

public class Print {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
        System.out.println();
        for (int element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
