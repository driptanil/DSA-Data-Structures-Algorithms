package com.inclass.properties.polymorphism;

public class Main {
    // Poly + Morphism = Many + Ways to represent
    public static void main(String[] args) {
        /*
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();*/

        /*
        Types of Polymorphism:
         1. Compile Time / Static Polymorphism:
            - this is achieved by method overloading
                (same name for multiple constructors but parameters are not same)
         2. Runtime / Dynamic Polymorphism:
            - achieved by method overriding
                (same name for methods in inheritance)
        */

        // ::METHOD OVERRIDING::

        /*
        Here the reference is Shapes, and if Shapes class does not have a function area() -> ERROR
        and an object of Triangle class is created, but the area() function of Triangle will be called
        */

        /*
        This is also called late binding.
        Parent obj = new Child(); is known as ::Upcasting::

        reference -> determines what function would be accessed
        object -> determines which function would be accessed

        Java determines this using ::Dynamic Memory Dispatch::, which is determined at Runtime
        */

        Shapes triangle = new Triangle();
        triangle.area();



    }

}
