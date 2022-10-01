package com.inclass.access;

public class C {
    String name;

    public C(String name) {
        this.name = name;
    }

    protected void name() {
        System.out.println("I am " + name);
    }
}
