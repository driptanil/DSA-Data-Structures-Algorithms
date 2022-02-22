package com.inclass.strings;

public class Subset {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subset("", str));
    }

    static String subset (String sub, String str) {
        if (str.length() == 0) {
            return sub + " ";
        }
        return subset(sub + str.substring(0, 1), str.substring(1)) + subset(sub, str.substring(1));
    }
}
