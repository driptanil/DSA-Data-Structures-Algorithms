package com.inclass.problems;

/**
 * <p><b>202. Happy Number</b></p>
 * https://leetcode.com/problems/happy-number/
 * <p>Runtime: 1 ms, faster than 97.26% of Java online submissions for Happy Number.</p>
 * Memory Usage: 41.6 MB, less than 25.03% of Java online submissions for Happy Number.
 */
public class HappyNumber {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n) {
        return recursion(n, n);
    }

    static boolean recursion(int slow, int fast) {

        slow = square(slow);
        fast = square(square(fast));

        if (slow == 1 || fast == 1) {
            return true;
        }

        if (slow == fast) {
            return false;
        }

        return recursion(slow, fast);
    }

    static int square(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
