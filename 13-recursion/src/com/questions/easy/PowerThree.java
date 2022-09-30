package com.questions.easy;

public class PowerThree {
    public static void main(String[] args) {
        int n = 243;
        System.out.println(norecursion(n));
        System.out.println(recursion(n));
    }

    /*
    Runtime: 23 ms, faster than 45.17% of Java online submissions for Power of Three.
    Memory Usage: 47 MB, less than 37.69% of Java online submissions for Power of Three.
     */
    static boolean norecursion(int n) {
        int ans = (int) Math.round(Math.log(n) / Math.log(3));
        if (n == Math.pow(3,ans)) {
            return true;
        }
        return false;
    }

    /*
    Runtime: 33 ms, faster than 10.39% of Java online submissions for Power of Three.
    Memory Usage: 46.6 MB, less than 43.28% of Java online submissions for Power of Three.
     */
    static boolean recursion(int n) {
        if (n == 1) {
            return true;
        } if (n == 0 || n % 3 != 0) {
            return false;
        }
        return recursion(n / 3);
    }
}
