package com.inclass.easy;

/**
 * <p><b>367. Valid Perfect Square</b></p>
 * https://leetcode.com/problems/valid-perfect-square/
 */

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 21474;
        System.out.println(binarySearch(n));
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.
     * Memory Usage: 40.9 MB, less than 46.56% of Java online submissions for Valid Perfect Square.
     * @param target
     * @return
     */
    static boolean binarySearch(int target) {
        if (target == 1) {
            return true;
        }
        long start = 2;
        long end = target;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid < target) {
                start = mid + 1;
            } else if (mid * mid > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
