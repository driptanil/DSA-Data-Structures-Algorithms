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
     * Runtime: 7 ms, faster than 19.95% of Java online submissions for Intersection of Two Arrays.
     * Memory Usage: 43 MB, less than 70.17% of Java online submissions for Intersection of Two Arrays.
     * @param arr1
     * @param arr2
     * @return
     */
    static int[] intersection(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean bool = true;
                    for (int k = 0; k < index; k++) {
                        if (arr1[i] == arr3[k]) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool) {
                        arr3[index] = arr1[i];
                        index++;
                    }
                }
            }
        }
        return Arrays.copyOfRange(arr3, 0 , index);
    }
}
