package com.inclass;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num=23597;
//        int rev=0;
//        while(num>0){
//            rev=rev*10+num%10;
//            num/=10;
//        }
//        System.out.println(rev);

        //OR

        String num = "23597";
        String rev="";
        for (int i = num.length()-1; i >= 0; i--) {
            rev+=num.charAt(i);
        }
        System.out.println(rev);
    }
}
