package com.inclass.strings;

public class SkipString {
    public static void main(String[] args) {
        String str = "Martini";
        String target = "tin";
        System.out.println(skipString(str, target));
    }

    static String skipString (String str, String target) {
        if (str.length() < target.length()) {
            return str;
        }
        else if (str.startsWith(target)) {
            return skipString(str.substring(target.length()), target);
        }
        return str.charAt(0) + skipString(str.substring(1), target);
    }
}
