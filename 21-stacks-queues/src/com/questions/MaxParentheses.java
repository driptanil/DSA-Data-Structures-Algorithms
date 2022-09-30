package com.questions;

import java.util.Scanner;
import java.util.Stack;

public class MaxParentheses {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(maxDepth(str));
    }

    /**
     * <p><b>1614. Maximum Nesting Depth of the Parentheses</b></p>
     * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
     * <p>Runtime: 2 ms, faster than 29.24% of Java online submissions for Maximum Nesting Depth of the Parentheses.</p>
     * Memory Usage: 42.7 MB, less than 6.68% of Java online submissions for Maximum Nesting Depth of the Parentheses.
     * @param s
     * @return
     */
    static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            }
            else if (s.charAt(i) == ')') {
                stack.pop();
            }
            if (max < stack.size()) {
                max = stack.size();
            }
        }
        return max;
    }
}
