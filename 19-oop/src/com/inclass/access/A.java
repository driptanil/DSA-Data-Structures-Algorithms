package com.inclass.access;

public class A {
    private int num;
    String name;

    // setter
    public void setNum(int num) {
        this.num = num;
    }

    //getter
    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
