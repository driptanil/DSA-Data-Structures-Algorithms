package com.inclass.strings;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(subset("", str));
        System.out.println(subset2("", str));
    }

    static String subset (String sub, String str) {
        if (str.length() == 0) {
            return sub + " ";
        }
        return subset(sub + str.substring(0, 1), str.substring(1)) + subset(sub, str.substring(1));
    }

    static ArrayList<String> subset2(String sub, String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str.length() == 0) {
            list.add(sub);
            return list;
        }
        list.addAll((subset2(sub + str.substring(0, 1), str.substring(1))));
        list.addAll(subset2(sub, str.substring(1)));
        return list;
    }
}
