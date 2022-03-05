package com.inclass.strings;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterPhone {
    public static void main(String[] args) {
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String str = "23";
        System.out.println(letters(arr, str));
    }

        /*
    Runtime: 5 ms, faster than 41.38% of Java online submissions for Letter Combinations of a Phone Number.
    Memory Usage: 41.2 MB, less than 41.69% of Java online submissions for Letter Combinations of a Phone Number.
     */

    static List<String> letters (String[] arr, String str) {
        List<String> list = new ArrayList<>();
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

//     static List<String> recursion(String[] arr, String str) {
//        List<String> list = new ArrayList<>();
//        if (str.length() == 0) {
//            return list;
//        }
//        String temp = arr[str.charAt(0) - '0'];
//        for (int i = 0; i < temp.length(); i++) {
//
//        }
//    }
}