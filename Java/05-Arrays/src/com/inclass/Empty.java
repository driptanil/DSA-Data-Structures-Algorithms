package com.inclass;

public class Empty {
    public static void main(String[] args) {
//        int[] rnos= new int[5];
//        int[] rnos2 = {23, 12, 45, 32, 15};
        int[] ros; //declaration of array: ros is getting defined at the stack(compile time)
        ros = new int[5]; //initialisation: object is being created at heap(runtime)
        System.out.println(ros[0]);
        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}