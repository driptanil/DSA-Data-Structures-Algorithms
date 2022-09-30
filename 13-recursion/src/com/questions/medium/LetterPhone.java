package com.questions.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterPhone {
    public static void main(String[] args) {
        String str = "23";
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        System.out.println(stringArr(arr, str));
        int[] arr2 = new int[] {0, 0, 3, 6, 9, 12, 15, 19, 22, 26};
        System.out.println(intArr(arr2, str));
        recursionVoid(arr2, "", str);
        System.out.println("\n" + recursionList(arr2, "", str));
    }

    /*
    Runtime: 5 ms, faster than 41.19% of Java online submissions for Letter Combinations of a Phone Number.
    Memory Usage: 41.3 MB, less than 50.28% of Java online submissions for Letter Combinations of a Phone Number.
     */
    static List<String> stringArr(String[] arr, String str) {
        List<String> list = new ArrayList<>();
        if (str.length() != 0) {
            list.add("");
        }
        while (str.length() > 0) {
            int size = list.size();
            int num = str.charAt(0) - '0';
            if (arr[num].length() == 0) {
                list.add("");
            }
            str = str.substring(1);
            while (size-- > 0) {
                String temp = list.remove(0);
                for (int j = 0; j < arr[num].length(); j++) {
                    list.add(temp + arr[num].charAt(j));
                }
            }
        }
        return list;
    }

    /*
    Runtime: 5 ms, faster than 41.19% of Java online submissions for Letter Combinations of a Phone Number.
     Memory Usage: 41.2 MB, less than 51.03% of Java online submissions for Letter Combinations of a Phone Number.
     */
    static List<String> intArr(int[] arr, String str) {
        List<String> list = new ArrayList<>();
        if (str.length() != 0) {
            list.add("");
        }
        while (str.length() > 0) {
            int num = str.charAt(0) - '0';
            str = str.substring(1);
            int size = list.size();
            while (size-- > 0) {
                String temp = list.remove(0);
                int j = arr[num] - arr[num - 1];
                while (j-- > 0) {
                    list.add(temp + (char) (arr[num] - j + 'a' - 1));
                }
            }
        }
        return list;
    }

    static void recursionVoid(int[] arr, String one, String two) {
        if (two.length() == 0) {
            System.out.print(one + " ");
            return;
        }
        int num = two.charAt(0) - '0';
        int j = arr[num] - arr[num - 1];
        while (j-- > 0) {
            recursionVoid(arr, one + (char) (arr[num] - j + 'a' - 1), two.substring(1));
        }
    }

    static List<String> recursionList(int[] arr, String one, String two) {
        List<String> list = new ArrayList<>();
        if (two.length() == 0) {
            list.add(one);
            return list;
        }
        int num = two.charAt(0) - '0';
        int j = arr[num] - arr[num - 1];
        while (j-- > 0) {
            list.addAll(recursionList(arr, one + (char) (arr[num] - j + 'a' - 1), two.substring(1)));
        }
        return list;
    }
}