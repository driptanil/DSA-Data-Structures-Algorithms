package com.inclass.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student me = new Student(1, 99.54f);
        Student you = new Student(2, 90.54f);
        Student others = new Student(3, 89.52f);

        /*if (me > you) {
            System.out.println("I win !");
        } else {
            System.out.println("You win !");
        }*/

        if (me.compareTo(you) > 0) {
            System.out.println("I win !");
        }
        if (you.compareTo(me) > 0) {
            System.out.println("You win !");
        }

        Student[] list = {me, you, others};

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        /*Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.marks - o1.marks);
            }
        });*/

        // Lambda Functions
        Arrays.sort(list, (o1, o2) -> (int) (o2.marks - o1.marks));

        System.out.println(Arrays.toString(list));
    }
}
