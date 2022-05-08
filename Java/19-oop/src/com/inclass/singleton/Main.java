package com.inclass.singleton;

import com.inclass.access.B;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all 3 reference variable are pointing to just one object

        B object = new B(5, "Drip");
        System.out.println(object.num);

    }
}
