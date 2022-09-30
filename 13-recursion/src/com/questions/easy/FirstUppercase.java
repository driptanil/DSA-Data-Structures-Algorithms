package com.questions.easy;

public class FirstUppercase {
    public static void main(String[] args) {
        String web = "geeksforGeeks";
        checkUpper(web, 0);
    }

    static void checkUpper(String web, int count) {
        if (count > web.length()) {
            return;
        }
        if (web.charAt(count) >= 65 && web.charAt(count) <= 90) {
            System.out.println(web.charAt(count));
            return;
        }
        checkUpper(web, count + 1);
    }
}
