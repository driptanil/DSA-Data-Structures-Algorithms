package com.inclass.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] array;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.array = new int[]{1, 2, 3, 4, 5};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.array = new int[]{1, 2, 3, 4, 5};
    }

    /**
     * if `implements Cloneable` is not used then,
     * it throws a `CloneNotSupportedException`.
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
        /*// Shallow copy
        return super.clone();
        // or
        // Human twin = (Human) super.clone();
        */

        // Deep copy
        Human twin = (Human) super.clone();
        twin.array = new int[twin.array.length];
        for (int i = 0; i < twin.array.length; i++) {
            twin.array[i] = this.array[i];
        }
        return twin;
    }
}
