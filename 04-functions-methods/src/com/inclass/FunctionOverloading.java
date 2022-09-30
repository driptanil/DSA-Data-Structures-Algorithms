package com.inclass;

public class FunctionOverloading {
    public static void main(String[] args) {
        String name ="Driptanil";
        print();
        print(name);
    }

    static void print() {
        System.out.print("Hello ! ");
    }

    static void print(String name) {
        System.out.println(name);
    }
}
