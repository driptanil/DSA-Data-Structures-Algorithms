package com.questions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterPhone {
    public static void main(String[] args) {
        String str = "23";
        System.out.println(letters(str));
        System.out.println(letters("0"));
        -+
    }

    /*
    Runtime: 5 ms, faster than 41.38% of Java online submissions for Letter Combinations of a Phone Number.
    Memory Usage: 41.2 MB, less than 41.69% of Java online submissions for Letter Combinations of a Phone Number.
     */
    static List<String> letters (String str) {
        List<String> list = new ArrayList<>();
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (str.length() != 0) {
            list.add("");
        }
        for (int i = 0; i < str.length(); i++) {
            int size = list.size();
            while (size > 0) {
                String temp = list.remove(0);
                int j = str.charAt(i) - 48;
                for (int k = 0; k < arr[j].length(); k++) {
                    list.add(temp + arr[j].charAt(k));
                }
                size--;
            }
        }
        return list;
    }
}
`