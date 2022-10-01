package com.inclass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Use +, -, *, / (add spaces in between)");
        System.out.print("\t= ");
        float num1 = in.nextFloat();
        char operation = in.next().trim().charAt(0);
        float num2 = in.nextFloat();
        if(operation=='+'){
            float result = num1+num2;
            System.out.println("\t= "+result);
        }
        else if(operation=='-'){
            float result = num1-num2;
            System.out.println("\t= "+result);
        }
        else if(operation=='*'){
            float result = num1*num2;
            System.out.println("\t= "+result);
        }
        else if(operation=='/'){
            if(num2!=0) {
                float result = num1 / num2;
                System.out.println("\t= " + result);
            }
            else{
                System.out.println("Math Error");
            }
        }
        else{
            System.out.println("Error: use only (+,-,*,/)");
        }
    }
}