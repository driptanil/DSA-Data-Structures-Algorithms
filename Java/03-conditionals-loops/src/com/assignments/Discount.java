package com.assignments;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Price: ");
        int price=in.nextInt();
        System.out.print("Discount (in percent): ");
        float percent=in.nextFloat();
        float discount=price*percent/100;
        System.out.println("Discounted Price: "+discount);
        float total=price-discount;
        System.out.println("Remaining Price: "+total);
    }
}
