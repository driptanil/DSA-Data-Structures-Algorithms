package com.inclass.staticEg;

// outer classes cannot be static because it is not dependent on any other class
public class InnerClasses {
    // only inner classes can be static
    public static void main(String[] args) {
        // static class in class
        Test1 a = new Test1("a");
        Test1 b = new Test1("b");
        System.out.println(a.name + " " + b.name);

        // non-static class
        Test2 c = new Test2("c");
        Test2 d = new Test2("d");
        System.out.println(c.name + " " + d.name);

        // static String variable
        // static variable or methods are resolved during compile time.
        Test3 e = new Test3("e");
        Test3 f = new Test3("f");
        System.out.println(e.name + " " + f.name);

        Test1 drip = new Test1("Driptanil");
        System.out.println(drip);
        // com.inclass.staticEg.InnerClasses$Test1@3ac3fd8b
        // Driptanil (with toString() method)
    }

    static class Test1 {
        String name;
        public Test1(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

class Test2 {
    String name;

    public Test2(String name) {
        this.name = name;
    }
}

class Test3 {
    static String name;

    public Test3(String name) {
        Test3.name = name;
    }
}