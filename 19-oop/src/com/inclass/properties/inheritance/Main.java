package com.inclass.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        /*
        Box box = new Box();
        System.out.println(box.l + ", " + box.w + ", " + box.h);

        Box box2 = new Box(4);
        System.out.println(box2.l + ", " + box2.w + ", " + box2.h);

        Box box3 = new Box(1, 2, 3);
        System.out.println(box3.l + ", " + box3.w + ", " + box3.h);

        Box box4 = new Box(box2);
        System.out.println(box4.l + ", " + box4.w + ", " + box4.h);
        */

        /*BoxWeight box5 = new BoxWeight();
        System.out.println(box5.l + ", " + box5.w + ", " + box5.h + ", " + box5.weight);
*/
        // child can access the parent class variable, but the reverse is not true

        /*Box box6 = new BoxWeight(1, 2, 3, 4);
        System.out.println(box6.l);
        System.out.println(box6.h);
        System.out.println(box6.w);*/
        // weight variable is not access able, inspite of initialising weight variable
        // ::NOTE::
        // The type of the reference variable and not the type of the object,
        // that actually determines what members can be accessed
//        System.out.println(box6.weight);
        // ERROR

        // here the object itself is of parent class,
        // and it is not possible call the constructor of parent class
//        BoxWeight box7 = new Box(2, 3, 4);
        // ERROR

        /*
        Types of Inheritance:
            1. Simple Inheritance:
                One class extends another class
            2. Multi Inheritance:
                One class extends more than one class
            3. Hierarchical Inheritance:
                One class is inherited from many class
            4. Hybrid Inheritance:
                both multi and hierarchical inheritance
        */

//        BoxPrice box8 = new BoxPrice(1, 2, 3, 4, 5);
//        System.out.println(box8.l + " " + box8.h + " " + box8.w + " " + box8.weight + " " + box8.price);

    }
}
