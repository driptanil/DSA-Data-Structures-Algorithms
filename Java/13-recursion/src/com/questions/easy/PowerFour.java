package com.questions.easy;

public class PowerFour {
    public static void main(String[] args) {
        int n = 64;
        System.out.println(recursion(n));
        System.out.println(norecursion(n));
    }

    /*
    Runtime: 2 ms, faster than 61.35% of Java online submissions for Power of Four.
    Memory Usage: 41.8 MB, less than 8.79% of Java online submissions for Power of Four.
     */
    static boolean norecursion(int n) {
        int ans = (int) Math.round(Math.log(n) / Math.log(4));
        if (n == Math.pow(4, ans)) {
            return true;
        }
        return false;
    }

    /*
    Runtime: 1 ms, faster than 93.64% of Java online submissions for Power of Four.
    Memory Usage: 41 MB, less than 38.21% of Java online submissions for Power of Four.
     */
    static boolean recursion(int n) {
        if (n == 1) {
            return true;
        } if (n == 0 || n % 4 != 0) {
            return false;
        }
        return recursion(n / 4);
    }
}
