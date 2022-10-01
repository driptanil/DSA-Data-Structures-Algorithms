package com.inclass.strings;

public class SubsequenceAscii {
    public static void main(String[] args) {
        String str ="ab";
        System.out.println(subsequenceAscii("", str));
    }

    static String subsequenceAscii(String set, String str) {
        if (str.length() == 0) {
            return set + ", ";
        }
        return subsequenceAscii(set + str.charAt(0), str.substring(1)) + subsequenceAscii(set + (int) str.charAt(0), str.substring(1) ) +  subsequenceAscii(set, str.substring(1));
    }
}
