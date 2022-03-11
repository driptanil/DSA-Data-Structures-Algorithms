package com.assignments.easy;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/add-to-array-form-of-integer/

public class ArrayofInt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0};
        int k = 1234;
        System.out.println(arrInt(arr, k));
    }

    static ArrayList<Integer> arrInt (int[] arr, int k) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            n *= 10;
            n += arr[i];
        }
        k += n;
        int count = (int) Math.log10(k);
        ArrayList<Integer> list = new ArrayList<>(count + 1);
        while (count >= 0) {
            list.add((k / (int) Math.pow(10, count)));
            k -= (k / (int) Math.pow(10, count)) * Math.pow(10, count);
            count--;
        }
        return list;
    }
}
