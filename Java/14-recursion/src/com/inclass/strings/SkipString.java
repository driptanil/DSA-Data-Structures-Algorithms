package com.inclass.strings;

public class SearchWord {
    public static void main(String[] args) {
        String str = "Martini";
        String target = "tinii";
        System.out.println(searchWord(str, target));
    }

    static boolean searchWord (String str, String target) {
        if (str.length() < target.length()) {
            return false;
        }
        else if (str.startsWith(target)) {
            return searchWord(str.substring(1), target);
        }
        return true;
    }
}
