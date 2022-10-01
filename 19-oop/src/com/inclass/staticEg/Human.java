// 01

package com.inclass.staticEg;

public class Human {
    // age, name, salary, married are instance variables.
    // population is a static variable.
    int age;
    String name;
    int salary;
    boolean married;
    // some type of property which is common for all the objects
    // property which are independent of all objects -> static variable or static methods
    static long population = 0;

    static void greeting() {
        System.out.println("Hello, World");
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // this.population += 1;
        // works but not conventionally correct
        Human.population += 1;

        Human.greeting();
    }
}