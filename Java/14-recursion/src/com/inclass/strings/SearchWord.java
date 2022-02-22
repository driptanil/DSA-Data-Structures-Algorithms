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
        for (int i = 0; i < target.length(); i++) {
            if (str.charAt(i) != target.charAt(i)) {
                return searchWord(str.substring(1), target);
            }
        }
        return true;
    }
}
