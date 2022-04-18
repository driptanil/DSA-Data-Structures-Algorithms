package com.inclass.strings;

import java.util.ArrayList;

public class SubsequencesAscii {
    public static void main(String[] args) {
        String str = "ab";
        System.out.println(subAscii("", str));
    }

    static ArrayList<String> subAscii(String sub, String str) {
        ArrayList<String> list = new ArrayList<>(1);
        if (str.isEmpty()) {
            list.add(sub);
            return list;
        }
        list.addAll(subAscii(sub + str.substring(0, 1), str.substring(1)));
        list.addAll(subAscii(sub + (int) str.charAt(0) + "", str.substring(1)));
        list.addAll(subAscii(sub, str.substring(1)));
        return list;
    }
}
