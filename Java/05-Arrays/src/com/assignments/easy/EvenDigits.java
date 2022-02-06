package com.assignments.easy;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(evenDigits(arr));
    }

    /*
    Runtime: 1 ms, faster than 98.22% of Java online submissions for Find Numbers with Even Number of Digits.
    Memory Usage: 43.2 MB, less than 8.53% of Java online submissions for Find Numbers with Even Number of Digits.
     */
    static int evenDigits (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (((int) (Math.log10(arr[i])) & 1) != 0) {
                count++;
            }
        }
        return count;
    }
}
