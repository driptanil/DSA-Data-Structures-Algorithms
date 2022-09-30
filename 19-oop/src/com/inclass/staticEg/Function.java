package com.inclass.staticEg;

public class Function {
    public static void main (String[] args) {
        // this does not work non-static methods
//        greeting();
    }
    // something which is not static belongs to an object
    // in a static method, non-static method cannot be used
    // a static method can only access static data

    // this depends on objects
    void greeting() {
        System.out.println("Hello, Good Morning");
    }

    // this is not dependent on objects
    static void greet() {
        // non-static methods requires an instance
        // but static does not depend on instances.
//        greeting(name);

        // this works
        // here non-static method is referenced

        // a reference is created inside the stack which points
        // to multiple objects inside the heap memory
        Function obj = new Function();
        obj.greeting();
    }
}
