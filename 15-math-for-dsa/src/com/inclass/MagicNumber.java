package com.inclass;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int base = 5;
        System.out.println(magicNo(n, base));
    }

    static int magicNo(int n, int base) {
        int magic = 0;
        for (int i = 0; i < 8; i++) {
            if ((n & (1 << i)) == (1 << i)) {
                magic += Math.pow(base, i + 1);
            }
        }
        return magic;
    }
}
