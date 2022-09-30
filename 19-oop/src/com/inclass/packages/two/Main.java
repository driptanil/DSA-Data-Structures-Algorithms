package com.inclass.packages.two;

public class Main {
    public static void main (String[] args) {
        greeting("Two");
    }

    // public allows this function to be used in other files
    public static void greeting(String name) {
        System.out.println("Hello, " + name);
    }
}
