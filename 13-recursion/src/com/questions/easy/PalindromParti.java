package com.questions.easy;

public class PalindromParti {
    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(palindrom(str, 0));
    }

    static String palindrom(String str, int index) {
        if ((index + 1) * 2 > str.length()) {
            return str;
        }
        if (str.charAt(index) != str.charAt(str.length() - 1 - index)) {
            str = str.substring(0, index) + " " + str.substring(index, str.length() - 1 - index) + " " + str.substring(str.length() - 1 - index);
            return palindrom(str, index + 2);
        }
        return palindrom(str, index + 1);
    }
}
