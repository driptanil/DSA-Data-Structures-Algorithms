package com.inclass.properties.polymorphism;

public class Shapes {
    /*
    ::FINAL::
     using final keyword restricts method overriding and inheritance
     works at compile time
     this is called early binding


     ::STATIC::
      When static method gets inherited, they don't get overridden
      in the child class, because the method, in the parent class will always
      run no matter from which object it is called.
     */
    void area() {
        System.out.println("I am in Shapes");
    }
}
