package com.inclass.easy;

/**
 * <p><b>744. Find Smallest Letter Greater Than Target</b></p>
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = new char[]{'e', 'e', 'n'};
        char target = 'e';
        System.out.println(binarySearch(letters, target));
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Smallest Letter Greater Than Target.
     * Memory Usage: 49 MB, less than 7.54% of Java online submissions for Find Smallest Letter Greater Than Target.
     * @param letters
     * @param target
     * @return
     */
    static char binarySearch(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}
