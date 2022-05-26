package com.inclass.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // multiple threads can access Arraylist
        List<Integer> arrayList = new ArrayList<>();

        List<Integer> linkedList = new LinkedList<>();

        // only a single threads can access Vector
        List<Integer> vector = new Vector<>();
    }
}
