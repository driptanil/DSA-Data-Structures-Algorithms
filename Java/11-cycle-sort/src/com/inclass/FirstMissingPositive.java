package com.inclass;

import java.util.Arrays;

public class FirstMissingPositive {

    // https://leetcode.com/problems/first-missing-positive/

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(solution(arr));
    }

    /* Solution:
    Runtime: 2 ms, faster than 98.84% of Java online submissions for First Missing Positive.
    Memory Usage: 96.5 MB, less than 72.60% of Java online submissions for First Missing Positive.
     */
    static int solution(int[] arr) {
        int count = 0;
        while (count < arr.length) {
            if (1 <= arr[count] && arr[count] <= arr.length) {
                if (arr[count] == count + 1 || arr[count] == arr[arr[count] - 1]) {
                    count++;
                } if (arr[count] == count + 1 || arr[count] == arr[arr[count] - 1]) {
                    int temp = arr[count];
                    arr[count] = arr[temp - 1];
                    arr[temp - 1] = temp;
                }
            } else {
                count++;
            }
        }
        int i;
        for (i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                break;
            }
        }
        return i + 1;
    }
}
