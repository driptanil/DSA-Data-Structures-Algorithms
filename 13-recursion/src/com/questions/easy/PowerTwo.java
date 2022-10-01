package com.questions.easy;

public class PowerTwo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(recursion(n));
        System.out.println(norecursion(n));
    }

    /*
    Runtime: 2 ms, faster than 62.92% of Java online submissions for Power of Two.
    Memory Usage: 40.8 MB, less than 39.54% of Java online submissions for Power of Two.
     */
    static boolean norecursion(int n) {
        int ans = (int) Math.round(Math.log(n) / Math.log(2));
        if (n == Math.pow(2,ans)) {
            return true;
        }
        return false;
    }

    /*
    Runtime: 2 ms, faster than 62.92% of Java online submissions for Power of Two.
    Memory Usage: 41.2 MB, less than 33.74% of Java online submissions for Power of Two.
     */
    static boolean recursion(int n) {
        if (n == 1) {
            return true;
        } if (n == 0 || n % 2 != 0) {
            return false;
        }
        return recursion(n / 2);
    }
}
