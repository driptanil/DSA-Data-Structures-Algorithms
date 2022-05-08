package com.inclass.access;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        A obj = new A (18, "Driptanil");
        // access the data members

        ArrayList<Integer> list = new ArrayList<>();
        /*
        // this DEFAULT_CAPACITY is private and final
        list.DEFAULT_CAPACITY;*/

        /*// in A class, num is private. This is Data Hiding
        obj.num;*/

        obj.setNum(5);
        System.out.println(obj.getNum());

    }
}
