package com.inclass;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);

         for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}