package com.inclass;

import java.util.Arrays;

public class SetMismatch {

    // https://leetcode.com/problems/set-mismatch/

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(Arrays.toString(solution(arr)));
    }

    /* Solution:
    Runtime: 2 ms, faster than 91.15% of Java online submissions for Set Mismatch.
    Memory Usage: 40.9 MB, less than 42.38% of Java online submissions for Set Mismatch.
     */
    static int[] solution(int[] arr) {
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
        int i;
        for (i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]){
                break;
            }
        }
        return new int[]{arr[i], i + 1};
    }
}
