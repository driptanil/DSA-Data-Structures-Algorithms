package com.inclass.basics;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[] {'h','e','l','l','o'};
        swap(s, 0);
        System.out.println(Arrays.toString(s));
    }

    static void swap(char[] s, int count) {
        if (count < s.length / 2) {
            char temp = s[count];
            s[count] = s[s.length - count - 1];
            s[s.length - count - 1] = temp;
            swap(s, count + 1);
        }
    }
}
