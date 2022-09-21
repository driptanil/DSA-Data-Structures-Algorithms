package com.questions;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {
    public static void main (String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine();
        String str = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(str));
    }

    /**
     * <p><b>1021. Remove Outermost Parentheses</b></p>
     * https://leetcode.com/problems/remove-outermost-parentheses/
     * <p>Runtime: 8 ms, faster than 58.16% of Java online submissions for Remove Outermost Parentheses.</p>
     * Memory Usage: 42.6 MB, less than 78.50% of Java online submissions for Remove Outermost Parentheses.
     * @param s
     * @return
     */
    static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (stack.size() != 0) {
                    strBuilder.append('(');
                }
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                stack.pop();
                if (stack.size() != 0) {
                    strBuilder.append(')');
                }
            }
        }
        return String.valueOf(strBuilder);
    }
}
