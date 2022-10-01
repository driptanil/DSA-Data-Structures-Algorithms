package com.questions.easy;

public class StringLength {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(length(str, 0));
    }

    static int length(String str, int count) {
        if (str.equals("")) {
            return count;
        }
        return length(str.substring(1), count + 1);
    }
}
