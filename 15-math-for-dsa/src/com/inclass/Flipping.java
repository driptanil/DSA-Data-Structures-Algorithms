package com.inclass;

// https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class Flipping {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0},
        };
        flip(image);
    }
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Flipping an Image.
Memory Usage: 42.3 MB, less than 12.24% of Java online submissions for Flipping an Image.
 */
    static int[][] flip (int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = image[i][j];
                image[i][j] = temp;
            }
            System.out.println(Arrays.toString(image[i]));
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = image[i][j] ^ 1;
            }
            System.out.println(Arrays.toString(image[i]));
        }
        return image;
    }
}
