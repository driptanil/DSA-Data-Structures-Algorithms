package com.questions.easy;

public class Parenthesis {
    public static void main(String[] args) {
//        unicode();
        String str = "[()]{}{[()()]()}";
        System.out.println(parenthesis(str, 1, str.charAt(0)));
    }

    static boolean parenthesis(String str, int index, int temp) {
        if (index == str.length()) {
            return true;
        }
        int uni = (int) str.charAt(index);
        switch (uni) {
            case 123:
                return parenthesis(str, index + 1, 123);
            case 91:
                return parenthesis(str, index + 1, 91);
            case 40:
                return parenthesis(str, index + 1, 40);
            case 125:
                if (temp + 2 == 125) {
                    return parenthesis(str, index + 2, str.charAt(index + 1));
                }
                return false;
            case 93:
                if (temp + 2 == 93) {
                    return parenthesis(str, index + 2, str.charAt(index + 1));
                }
                return false;
            case 41:
                if (temp + 1 == 41) {
                    return parenthesis(str, index + 2, str.charAt(index + 1));
                }
                return false;
            default:
                return false;
        }
    }

    static void unicode() {
        String str = "{}[]()";
        for (int i = 0; i < str.length(); i++) {
            int val = (int) str.charAt(i);
            System.out.print(val + ", ");
        }
    }
}
