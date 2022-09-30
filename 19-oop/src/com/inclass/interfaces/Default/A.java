package com.inclass.interfaces.Default;

public interface A {

    static void greeting() {
        System.out.println("Hello World !");
    }

    default void fun() {
        System.out.println("A -> fun");
    }
}
