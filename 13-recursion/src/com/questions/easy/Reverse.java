package com.questions.easy;

public class Reverse {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(newplace(str));
        System.out.println(inplace(str, str.length() - 1));
    }

    static String newplace(String str) {
        String temp = "";
        temp += str.charAt(str.length() - 1);
        if (str.length() == 1) {
            return temp;
        }
        return temp + newplace(str.substring(0, str.length() - 1));
    }

    static String inplace(String str, int count) {
        String temp = "";
        temp += str.charAt(count);
        if (count == 0) {
            return temp;
        }
        return temp + inplace(str, count - 1);
    }
}
