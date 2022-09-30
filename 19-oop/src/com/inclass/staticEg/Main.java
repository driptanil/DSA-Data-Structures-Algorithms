package com.inclass.staticEg;

public class Main {
    public static void main(String[] args) {
        // if class is in the same package, then no need to import it
        Human driptanil = new Human(18, "Driptanil", 0, false);
        Human datta = new Human(18, "Datta", 0, false);
        /*
        System.out.println(driptanil.population);
        System.out.println(datta.population);

        // same output but not conventionally correct
        // always use class_name.static_variable
        */

        System.out.println(Human.population);
    }
}
