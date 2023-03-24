package com.assignments;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 1534236469;
        System.out.println(reverseInteger(num));
    }

    /**
     * <b>7. Reverse Integer</b>
     * https://leetcode.com/problems/reverse-integer/
     * Runtime 1 ms Beats 100%
     * Memory 39.4 MB Beats 76%
     * @param x
     * @return
     */
    static int reverseInteger(int x) {

        long reverse = 0;

        while(x!=0){
            reverse = reverse * 10 + x % 10;
            x = x/10;
        }
        if(reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE)
            return (int)reverse;
        return 0;
    }

}
