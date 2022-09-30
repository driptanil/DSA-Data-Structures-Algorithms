package com.inclass.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        /*int c = a / b;
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        */

        /*try{
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage() + " !");
        } finally {
            System.out.println("This will always execute...");
        }*/

       /* try{
            int div = divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " !");
        } catch (Exception e) {
            System.out.println("This is not an ArithmeticException : (");
        } finally{
            System.out.println("This will always execute...");
        }*/

        String name = "Driptanil";
        try {
            if (name.equals("Driptanil")) {
                throw new MyException("How you doing ?");
            }
        } catch (MyException e) {
            System.out.println("Joey: " + e.getMessage());
        }
    }

    static int divide (int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("dividing by 0 -> infinity");
        }
        return a / b;
    }
}
