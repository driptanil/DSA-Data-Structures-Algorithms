package com.inclass;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        args(1, 2, 3, 4, 5, 6, 7, 8);
    }

    static void args(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
