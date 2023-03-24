package com.assignments;

public class ValidPalindrome {

    public static void main (String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    /**
     * <b>125. Valid Palindrome</b>
     * https://leetcode.com/problems/valid-palindrome/
     * Runtime 3 ms Beats 96.78%
     * Memory 42.4 MB Beats 71.67%
     * @param s
     * @return
     */
     static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
