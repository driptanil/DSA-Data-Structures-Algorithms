package com.inclass;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(count<=n){
            int temp = a;
            a = b;
            b = b + temp;
            count++;
            System.out.print(b+" ");
        }
    }
}
