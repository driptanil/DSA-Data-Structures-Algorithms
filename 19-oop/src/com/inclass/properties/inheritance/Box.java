package com.inclass.properties.inheritance;

public class Box {
    // the child class is inheriting properties from base class
    // child class = properties of base class + properties of its own
    // extends keyword allows child class to inherit variables form base class

    /*
    class Child extends Base {

    }
    */

    double l;
    double h;
    double w;

    Box() {
        this.l = 0;
        this.h = 0;
        this.w = 0;
    }

    Box (double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box (Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
