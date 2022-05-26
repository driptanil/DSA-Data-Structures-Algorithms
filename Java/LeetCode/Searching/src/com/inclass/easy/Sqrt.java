package com.inclass.easy;

/**
 * <p><b>69. Sqrt(x)</b></p>
 * https://leetcode.com/problems/sqrtx/
 */
public class Sqrt {
    public static void main(String[] args) {
        int x = 80;
        System.out.println(binarySearch(x));
    }

    /**
     * Runtime: 30 ms, faster than 8.31% of Java online submissions for Sqrt(x).
     * Memory Usage: 41.2 MB, less than 60.90% of Java online submissions for Sqrt(x).
     * <p>space complexity: O(1)</p>
     * <p>time complexity: O(root(x))</p>
     * @param x
     * @return
     */
    static int linearSearch(int x) {
        long y = 0;
        while (y * y <= x) {
            y++;
        }
        return (int) y - 1;
    }

    /**
     * Runtime: 2 ms, faster than 71.98% of Java online submissions for Sqrt(x).
     * Memory Usage: 42.1 MB, less than 7.40% of Java online submissions for Sqrt(x).
     *
     * <p>Space Complexity: O(1)</p>
     * <p>Time Complexity: O(log(n))</p>
     * @param x
     * @return
     */
    static int binarySearch(int x) {
        long start = 0, end = Integer.MAX_VALUE;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid <= x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}
