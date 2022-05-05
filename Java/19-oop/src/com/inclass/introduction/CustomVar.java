package com.inclass.introduction;

public class CustomVar {

    public static void main(String[] args) {
        // in java primitives, are not objects, they are only stored in stack memory
        Student drip = new Student();
        System.out.println(drip.roll);
        System.out.println(drip.name);
        System.out.println(drip.marks);

        System.out.println();

        Student dript = new Student(12, "Driptanil Datta", 90);
        System.out.println(dript.roll);
        System.out.println(dript.name);
        System.out.println(dript.marks);

        System.out.println();

        drip.changeName("Driptanil");
        drip.greeting();

        System.out.println();

        drip.clone(dript);
        drip.greeting();
    }

}
class Student {
    int roll;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello!, My name is " + this.name);
    }

    void changeName(String fullName) {
        this.name = fullName;
    }

    void clone(Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

    // constructor is a function, that helps to initialize
    Student() {
        this.roll = 0;
        this.name = "anonymous";
        this.marks = 0.0f;
    }

    Student (int rollNo, String fullName, float examMarks) {
        this.roll = rollNo;
        this.name = fullName;
        this.marks = examMarks;
    }
}
