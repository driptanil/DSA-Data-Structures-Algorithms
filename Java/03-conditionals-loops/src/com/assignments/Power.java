package com.assignments;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Base: ");
        float base=in.nextFloat();
        System.out.print("Power: ");
        float power=in.nextFloat();
        double result=Math.pow(base,power);
        System.out.println("Result: "+result);
    }
}
