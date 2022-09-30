package com.assignment;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("INR : ₹ ");
        float inr = input.nextFloat();
        double usd = inr * 0.014;
        System.out.println("USD : $ " + usd);
    }
}
