package com.inclass;

import java.util.Arrays;

public class Ambigutity {
    public static void main(String[] args) {
        // func(); ERROR !
    }

    static void func(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void func(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
