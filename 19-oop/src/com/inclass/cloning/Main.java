package com.inclass.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
        Human drip = new Human(18, "Driptanil");
        Human twin = new Human(drip);

        // better implication than using `new` keyword and is much faster
        Human clone =(Human) drip.clone();
        System.out.println(clone.age + " " + clone.name + "\n");



        System.out.println(Arrays.toString(clone.array)+ "\n");
        clone.array[0] = 100;
        System.out.println(Arrays.toString(clone.array));
        System.out.println(Arrays.toString(drip.array));
        // This is shallow copy
        // only create a new reference variable pointing to the same object

        // Deep copy:
        // new reference variable pointing to copy of new object


    }
}
