package com.inclass.introduction;

public class Wrapper {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap (a,b);
        System.out.println(a);
        System.out.println(b);

        // in the Integer Wrapper Class, final keyword is used
        // final helps to initialize variable, which cannot be modified
        // always initialize while declaring
        // this is only for primitives
        final float pi = 3.14f;

        // but final of non-primitives
        // value of object can be changed, but new object cannot be assigned
        final A drip = new A("Driptanil");
        drip.name = "Drip";
//        drip = new A("Error");

        A obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new A("LOL");
        }

        // System.out.println(obj);
        // will print package with hash code
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    String name;

    A (String fullName) {
        this.name = fullName;
    }

    // printing objects "PrintStream" internally calls the .toString()
    // if the .toString() method is not present in the object
    // it prints the default to .toString() method which prints the hash code
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}