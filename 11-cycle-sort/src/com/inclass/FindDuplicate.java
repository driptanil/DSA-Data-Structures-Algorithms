package com.inclass;

import java.util.Arrays;
// https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(solution(arr));
    }

    /* Solution:
    Runtime: 6 ms, faster than 55.99% of Java online submissions for Find the Duplicate Number.
    Memory Usage: 56.9 MB, less than 47.65% of Java online submissions for Find the Duplicate Number.
     */
    static int solution(int[] arr) {
        int count = 0;
        while(count < arr.length) {
            if (arr[count] == count + 1 || arr[count] == arr[arr[count] - 1]) {
                count++;
            }
            else {
                int temp = arr[count];
                arr[count] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        return arr[count - 1];
    }
}
