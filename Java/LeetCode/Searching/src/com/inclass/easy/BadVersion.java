package com.inclass.easy;

/**
 * <p><b>278. First Bad Version</b></p>
 * https://leetcode.com/problems/first-bad-version/
 */
public class BadVersion {
    static final int first_bad_version = 8;

    public static void main(String[] args) {
        int n = 10;
        System.out.println(firstBadVersion(n));
    }

    /**
     * <p><b>Given</b></p>
     * isBadVersion(version) which returns whether version is bad.
     * @return
     */
    static boolean isBadVersion(int n) {
        if (n >= first_bad_version) {
            return true;
        }
        return false;
    }

    /**
     * Runtime: 14 ms, faster than 91.47% of Java online submissions for First Bad Version.
     * Memory Usage: 40.3 MB, less than 69.62% of Java online submissions for First Bad Version.
     * @param end
     * @return
     */
    static int firstBadVersion(int end) {
        int start = 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
