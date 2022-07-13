// not solved

package com.assignments.medium;

public class NoRepeatChar {
    public static void main (String[] args) {
        String str = "abcabcbb";
        System.out.println(noChar(str));
//        System.out.println(noChar("pwwkew"));

    }

    static int noChar(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
