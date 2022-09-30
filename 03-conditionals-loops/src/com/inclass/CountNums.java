package com.inclass;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String num = in.next();
        /*String num="1385757879";
        int count=0;
        int length=num.length();
        for (int i = 0; i < length; i++) {
            if (num.charAt(i)=='7'){
                count++;
            }
        }
        System.out.println(count);*/

        //OR

        int num=1385757879;
        int count=0;
        while(num>0){
            if (num%10==7){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
