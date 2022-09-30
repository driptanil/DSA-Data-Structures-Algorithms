package com.inclass.abstractDemo;

public class Main {
    public static void main (String[] args) {
        Son son = new Son();
        son.career("Boy");

        Daughter daughter = new Daughter();
        daughter.career("Girl");

        Parent.greeting();
    }
}
