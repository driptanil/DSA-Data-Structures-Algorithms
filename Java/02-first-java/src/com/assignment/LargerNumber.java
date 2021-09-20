package com.assignment;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Number : ");
        float num1 = input.nextFloat();
        System.out.print("Second Number : ");
        float num2 = input.nextFloat();

        if(num1 > num2) {
            System.out.println(num1 + " > " + num2);
        }
         else if(num1 < num2) {
            System.out.println(num1 + " < " + num2);
        }
        else {
            System.out.println(num1 + " = " + num2);
        }
    }
}
