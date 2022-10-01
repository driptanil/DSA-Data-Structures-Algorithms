package com.inclass.collections;

public class EnumsEg {
    /**
     * All enum extends java.lang.enum class,
     * <p>Days are called enum constants, is public,
     * static & final member (child enums cannot be created</p>
     */
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        /**
         * This constructor is not public or protected, only private or default.
         * we don't need to create new objects, as enums have fixed objects
         *
         * <p>internally: <pre>public static final Week</pre></p>
         *
         * <p>`this` is overridden by the members</p>
         */
        Week() {
            System.out.println("Constructor: " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello !");
        }
    }

    public static void main(String[] args) {
        Week week;

        /*for(Week day: Week.values()) {
            System.out.println(day);
        }*/

        /*week = Week.Monday;
        System.out.println("\n" + week.ordinal());
        // prints the index of the member in enum*/

        week = Week.Monday;

        week.hello();

        System.out.println(Week.valueOf("Monday"));
    }
}
