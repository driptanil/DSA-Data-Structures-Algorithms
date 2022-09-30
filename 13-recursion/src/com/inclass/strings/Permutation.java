package com.inclass.strings;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutation("", str);
        System.out.println("\n" + permu("", str));
        System.out.println(countPermu(str.length()));
        System.out.println(norecusion(str));
    }

    static void permutation (String one, String two) {
        if (two.length() == 0) {
            System.out.print(one + ", ");
            return;
        }
        for (int i = 0; i <= one.length(); i++) {
            permutation(one.substring(0, i) + two.charAt(0) + one.substring(i), two.substring(1));
        }
    }

    static List<String> permu (String one, String two) {
        List<String> strarr = new ArrayList<>();
        if (two.length() == 0) {
            strarr.add(one);
            return strarr;
        }
        for (int i = 0; i <= one.length(); i++) {
            strarr.addAll(permu(one.substring(0, i) + two.charAt(0) + one.substring(i), two.substring(1)));
        }
        return strarr;
    }

    static int countPermu (int n) {
        if (n < 2) {
            return 1;
        }
        return n * countPermu(n - 1);
    }

    static List<String> norecusion (String two) {
        List<String> list = new ArrayList<>();
        list.add("");
        while (two.length() > 0) {
            int j = list.size() - 1;
            while (j >= 0) {
                for (int k = 0; k <= list.get(j).length(); k++) {
                    list.add(list.get(j).substring(0, k) + two.charAt(0) + list.get(j).substring(k));
                }
                list.remove(j);
                j--;
            }
            two = two.substring(1);
        }
        return list;
    }
}
