package com.inclass;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//        Scanner input = new Scanner(System.in);
//        int num = (int)(input.nextFloat());
//        System.out.println("Num = " + num);

//        Scanner input = new Scanner(System.in);
//        int a = (byte)(input.nextInt());
//        System.out.println("a = " + a);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;
//        System.out.println("d = "+d);

//        byte b = 50;
//        b = b * 2;
//        System.out.println("b = "+b);

//        int num = 'A';
//        System.out.println("ASCII of A = " + num);

//        System.out.println("こんにちは");

//        System.out.println( 3 * 6 );

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println("= " + (f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("= " + result);


    }
}
