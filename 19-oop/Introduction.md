# Introduction

```java
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
```

- `final` keyword, is used to initialise a variable which cannot be modified.
- for non-primitives, the value of object can be changed, but new object cannot be assigned.
 ````ad-success
 ```java
  final A drip = new A("Driptanil");
  drip.name = "Drip";
 ```
````

````ad-error
```java
final A drip = new A("Driptanil");
drip = new A("Datta");
```
````


```java
package com.inclass.introduction;  
  
public class Wrapper {  
    public static void main(String[] args) {  
        Integer a = 10;  
        Integer b = 20;  
        swap (a,b);  
        System.out.println(a);  
        System.out.println(b);  
      
        final float pi = 3.14f;  
       
        final A drip = new A("Driptanil");  
        drip.name = "Drip";  
//        drip = new A("Datta");  
  
        A obj;  
        for (int i = 0; i < 1000000; i++) {  
            obj = new A("LOL");  
        }  
        // System.out.println(obj);  
        // will print package with hash code    }  
  
    static void swap(Integer a, Integer b) {  
        Integer temp = a;  
        a = b;  
        b = temp;  
    }  
}  
  
class A {  
    String name;  
  
    A (String fullName) {  
        this.name = fullName;  
    }  
    // printing objects "PrintStream" internally calls the .toString()  
    // if the .toString() method is not present in the object    // it prints the default to .toString() method which prints the hash code 
    @Override  
    protected void finalize() throws Throwable {  
        System.out.println("Object is destroyed");  
    }
}
```

