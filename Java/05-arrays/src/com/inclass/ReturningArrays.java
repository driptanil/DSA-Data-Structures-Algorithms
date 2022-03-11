package com.inclass;

import java.util.Arrays;

public class ReturningArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArr()));
    }

    static int[] createArr() {
        return new int[] {1, 2, 3, 4, 5};
    }
}
