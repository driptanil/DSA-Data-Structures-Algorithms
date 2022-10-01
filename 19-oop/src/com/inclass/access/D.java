package com.inclass.access;

public class D extends C{

    public D(String name) {
        super(name);
    }

    @Override
    public void name() {
        System.out.println("I am not " + name);
    }

    public static void main(String[] args) {
        D d = new D("Driptanil");
        d.name();
    }
}
