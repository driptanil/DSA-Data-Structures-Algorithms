package com.assignment;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First Number : ");
        float num1 = input.nextFloat();

        System.out.print("Enter the Operation (+,-,*,/) : ");
        char operation = input.next().charAt(0);

        System.out.print("Second Number : ");
        float num2 = input.nextFloat();

        if (operation=='+') {
            float result = num1 + num2;
            System.out.println(num1 + " " + operation + " " + num2 + " = " + "result");
        }
        else if (operation=='-') {
            float result = num1 - num2;
            System.out.println(num1 + " " + operation + " " + num2 + " = " + "result");
        }
        else if (operation=='*') {
            float result = num1 * num2;
            System.out.println(num1 + " " + operation + " " + num2 + " = " + "result");
        }
        else if (operation=='/') {
            float result = num1 / num2;
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        }
        else {
            System.out.println("Wrong Operation !");
            System.out.println("\t Use +,-,*,/ only");
        }
    }
}
