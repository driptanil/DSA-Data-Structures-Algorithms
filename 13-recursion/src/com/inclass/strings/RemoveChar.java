package com.inclass.strings;

public class RemoveChar {
    public static void main(String[] args) {
        String word = "Linkin";
        char remove = 'i';
        removeChar(word, remove);
        System.out.println();
        System.out.println(removeChar2(word, remove));
    }

    static void removeChar (String word, char remove) {
        if (word.isEmpty()) {
            return;
        }
        removeChar(word.substring(0 , word.length() - 1), remove);
        if (word.charAt(word.length() - 1) != remove) {
            System.out.print(word.charAt(word.length() - 1));
        }
    }

    static String removeChar2 (String word, char remove) {
        if (word.isEmpty()) {
            return "";
        }
        if (word.charAt(word.length() - 1) == remove) {
            return removeChar2(word.substring(0, word.length() - 1), remove);
        }
        char ch = word.charAt(word.length() - 1);
        return removeChar2(word.substring(0, word.length() - 1), remove) + ch;
    }
}
