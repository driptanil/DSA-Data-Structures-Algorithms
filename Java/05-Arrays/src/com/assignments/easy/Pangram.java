package com.assignments.easy;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog"; // 97 // 122
        System.out.println(nestedLoop(sentence));
        insertionSort(sentence);
    }

    /*
    Runtime: 2 ms, faster than 63.92% of Java online submissions for Check if the Sentence Is Pangram.
    Memory Usage: 40 MB, less than 14.76% of Java online submissions for Check if the Sentence Is Pangram.
     */
    static boolean nestedLoop (String sentence) {
        int count = 0;
        for (int i = 97; i <= 122; i++) {
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == (char) i) {
                    count++;
                    break;
                }
            }
        }
        if (count == 26) {
            return true;
        }
        return false;
    }

    /*
    Runtime: 1 ms, faster than 88.13% of Java online submissions for Check if the Sentence Is Pangram.
    Memory Usage: 42.1 MB, less than 6.46% of Java online submissions for Check if the Sentence Is Pangram.
     */
    static boolean insertionSort (String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        char[] arr = sentence.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr[i] - 97]) {
                char temp = arr[arr[i] - 97];
                arr[arr[i] - 97] = arr[i];
                arr[i] = temp;
                i--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if ((int) arr[i] - 97 != i) {
                return false;
            }
        }
        return true;
    }
}
