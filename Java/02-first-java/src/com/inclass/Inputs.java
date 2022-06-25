package com.inclass;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter some input :");
        int rollno = input.nextInt();
//        System.out.println("Your roll number is " + rollno);

//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        System.out.println(name);

//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        System.out.println(name);
//
//        Scanner input =new Scanner(System.in);
//        System.out.print("Enter your marks : ");
//        float marks = input.nextFloat();
//        System.out.println("Your marks : " + marks);


        int num = input.nextInt();
        double deci = input.nextDouble();
        String str = input.nextLine();
        str = input.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + deci);
        System.out.println("Int: " + num);

        /*
            If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
        */

    }
}
