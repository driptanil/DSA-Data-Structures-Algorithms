package com.inclass.interfaces.Default;

public class Main implements A, B {
    @Override
    public void run() {
        System.out.println("B -> run");
    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.run();
        A.greeting();
    }
}
