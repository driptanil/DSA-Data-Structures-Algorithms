package com.inclass;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicate {

    // https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(arr));
    }

    /* Solution:
    Runtime: 5 ms, faster than 90.58% of Java online submissions for Find All Duplicates in an Array.
    Memory Usage: 48.3 MB, less than 43.90% of Java online submissions for Find All Duplicates in an Array.
     */
    static List<Integer> solution(int[] arr) {
        int count = 0;
        while (count < arr.length) {
            if (arr[count] == count + 1 || arr[count] == arr[arr[count] - 1]) {
                count ++;
            } else {
                int temp = arr[count];
                arr[count] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        List<Integer> duplicate = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]){
                duplicate.add(arr[i]);
            }
        }
        return duplicate;
    }
}
