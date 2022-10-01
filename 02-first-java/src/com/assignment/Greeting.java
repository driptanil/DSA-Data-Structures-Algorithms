package com.assignment;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = input.next();
        System.out.println("Hello , " + name);
    }
}
