package com.questions;

import java.util.Scanner;
import java.util.Stack;


public class Parantheses {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "";

        str = input.nextLine();

//        System.out.println(removeOuterParentheses(str));
//        System.out.println(isValidParantheses(str));
        System.out.println(longestValidParentheses(str));

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
    /**
     * <h1>20. Valid Parentheses</h1>
     * Runtime: 1 ms, faster than 99.17% of Java online submissions for Valid Parentheses.
     * Memory Usage: 40.3 MB, less than 58.04% of Java online submissions for Valid Parentheses.
     * <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
     */
    static boolean isValidParantheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    /**
     * <h1>32. Longest Valid Parentheses</h1>
     * <a href="https://leetcode.com/problems/longest-valid-parentheses/">...</a>
     */
    static int longestValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        int length = str.length();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{'|| stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }


        return length - stack.size();
    }
}
