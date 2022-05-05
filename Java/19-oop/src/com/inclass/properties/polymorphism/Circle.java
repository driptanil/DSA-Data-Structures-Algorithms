package com.inclass.properties.polymorphism;

public class Circle extends Shapes{
    // this is method overriding
    // to check for overriding use @Override
    @Override
    void area() {
        System.out.println("Area: pi * r * r");
    }
}
