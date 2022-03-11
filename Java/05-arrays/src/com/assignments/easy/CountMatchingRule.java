package com.assignments.easy;

// https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.ArrayList;

public class CountMatchingRule {
    public static void main(String[] args) {

    }

    /*
    Runtime: 3 ms, faster than 97.82% of Java online submissions for Count Items Matching a Rule.
    Memory Usage: 47.3 MB, less than 65.17% of Java online submissions for Count Items Matching a Rule.
     */
    static int countMatches (ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int type;
        if (ruleKey.equals("type")) {
            type = 0;
        } else if (ruleKey.equals("color")) {
            type = 1;
        } else {
            type = 2;
        }
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (((items.get(i)).get(type)).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
