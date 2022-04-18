package com.questions.easy;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subset("", str));
    }

    static List<String> subset (String a, String b) {
        List<String> list = new ArrayList<>();
        if (b.equals("")) {
            list.add(a);
            return list;
        }
        list.addAll(subset(a, b.substring(1)));
        list.addAll(subset(a + b.charAt(0), b.substring(1)));
        return list;
    }
}
