package com.assignments.easy;

public class BackSpace {
    public static void main(String[] args) {
        String s = "#ab#c";
        String t = "ad#c";
        System.out.println(backspace(s));
        System.out.println(backspace(t));
        System.out.println(backspace(s).equals(backspace(t)));
    }

    /**
     * <p><b>844. Backspace String Compare</b></p>
     *  https://leetcode.com/problems/backspace-string-compare/
     * <p>Runtime: 2 ms, faster than 65.46% of Java online submissions for Backspace String Compare.</p>
     * Memory Usage: 41.7 MB, less than 77.76% of Java online submissions for Backspace String Compare.
     * @param str
     * @return
     */
    static String backspace(String str) {
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '#') {
                if (i == 0) {
                    str = str.substring(1);
                    continue;
                }
                str = str.substring(0, i - 1) + str.substring(i + 1);
                i--;
            } else {
                i++;
            }
        }
        return str;
    }

    static boolean compareStr(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int iSkip = 0;
        int jSkip = 0;
        while (i >= 0 && j >= 0) {
            if (s.charAt(i) == '#' || t.charAt(j) == '#') {
               if (s.charAt(i) == '#') {

               } else {

               }
            } else {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                } else {
                    i--;
                    j--;
                }
            }
        }

    }

}
