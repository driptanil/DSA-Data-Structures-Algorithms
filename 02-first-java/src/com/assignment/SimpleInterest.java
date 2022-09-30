package com.assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Principal : ");
        long principal = input.nextLong();

        System.out.print("Years : ");
        int year = input.nextInt();

        System.out.print("Months : ");
        int month = input.nextInt();

        System.out.print("Rate (per annum in percentage) : ");
        float rate = input.nextFloat();

        float interest = principal * rate / 100 * ( year + month/12 );
        System.out.println("\nSimple Interest : " + interest);
    }
}
