package com.inclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class AllNumberDisappeared {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(arr));
    }

/* Solution :
Runtime: 6 ms, faster than 55.98% of Java online submissions for Find All Numbers Disappeared in an Array.
Memory Usage: 48.2 MB, less than 54.62% of Java online submissions for Find All Numbers Disappeared in an Array.
 */
    static List<Integer> solution(int[] arr) {
        cycleSort(arr);
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1){
                missing.add(i + 1);
            }
        }
        return missing;
    }

    static void cycleSort(int[] arr) {
        int count = 0;
        while (count < arr.length) {
            if (arr[count] != arr[arr[count] - 1]) {
                int temp = arr[count];
                arr[count] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                count++;
            }
        }
    }
}
