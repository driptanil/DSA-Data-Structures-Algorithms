package com.inclass.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student (int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    /**
     * without compareTo function, Arrays.sort does not work
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {
        return (int) (this.marks - o.marks);
    }

    @Override
    public String toString() {
        return rollno + ": " + marks;
    }
}
