package com.inclass.easy;

import java.util.Arrays;

/**
 * <p><b>349. Intersection of Two Arrays</b></p>
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {4, 5, 6, 5, 7};
    }

    /**
     * 
     * @param arr1
     * @param arr2
     * @return
     */
    static int[] intersection(int[] arr1, int[] arr2) {
        int[] arr3 = new int[Math.max(arr1.length, arr2.length)];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[index] = arr1[i];
                    index++;
                    break;
                }
            }
        }
        return Arrays.copyOfRange(arr3, 0 , index);
    }
}
