package com.inclass.easy;

/**
 * <p><b>1351. Count Negative Numbers in a Sorted Matrix</b></p>
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class CountNegative {
    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        System.out.println(binarySearch(grid));
        System.out.println(linearSearch(grid));
    }

    /**
     * Runtime: 10 ms, faster than 13.42% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
     * Memory Usage: 49.3 MB, less than 40.80% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
     * @param grid
     * @return
     */
    static int binarySearch(int[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            int start = 0;
            int end = grid[i].length;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (grid[i][mid] < 0) {
                    end = mid;
                } else if (grid[i][mid] >= 0) {
                    start = mid + 1;
                }
            }
            total += grid[i].length - start;
        }
        return total;
    }

    /**
     * Runtime: 1 ms, faster than 44.56% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
     * Memory Usage: 49.3 MB, less than 40.80% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
     * @param grid
     * @return
     */
    static int linearSearch(int[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    total += grid[i].length - j;
                    break;
                }
            }
        }
        return total;
    }
}
