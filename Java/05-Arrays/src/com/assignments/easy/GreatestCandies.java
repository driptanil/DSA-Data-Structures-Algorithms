package com.assignments.easy;

import java.util.ArrayList;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    /*
    Runtime: 1 ms, faster than 73.91% of Java online submissions for Kids With the Greatest Number of Candies.
    Memory Usage: 42.6 MB, less than 9.43% of Java online submissions for Kids With the Greatest Number of Candies.
     */
    static ArrayList <Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> bool = new ArrayList<>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                bool.add(true);
            } else {
                bool.add(false);
            }
        }
        return bool;
    }
}
