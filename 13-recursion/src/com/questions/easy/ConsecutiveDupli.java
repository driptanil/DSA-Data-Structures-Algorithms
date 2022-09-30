package com.questions.easy;

public class ConsecutiveDupli {
    public static void main(String[] args) {
        String str = "aaaaaaaaabbbbbbbbbbbbbccccccccc";
        System.out.println(duplicate(str, 0));
    }

    static String duplicate(String str, int index) {
        if (index > str.length() - 2) {
            return str;
        }
        if (str.charAt(index) == str.charAt(index + 1)) {
            return duplicate(str.substring(0, index) + str.substring(index + 1), index);
        }
        return duplicate(str, index + 1);
    }
}
