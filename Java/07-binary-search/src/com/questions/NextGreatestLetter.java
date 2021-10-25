package com.questions;

import java.util.Scanner;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class NextGreatestLetter {

    public static void main(String[] args) {
        char[] letters = {'c', 'g', 'x'};
        Scanner in = new Scanner(System.in);
        char target = in.next().charAt(0);
        if ((int)(letters[letters.length - 1]) <= (int)(target)) {
            System.out.println(letters[0]);
        }
        else {
            System.out.println(nextGreatestChar(letters, target));
        }
    }

    static char nextGreatestChar(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int index;
        while (start <= end) {
            index = start + (end - start) / 2;
            if ((int)(letters[index]) >= (int)(target)) {
                end = index - 1;
            }
            else {
                start = index + 1;
            }
        }
        return letters[start];
    }
}