package com.java.core.ExceptionHandling;

/**
 * Checked exception either we need to handle or throw it
 * Any exception which is not runtime exception and subclass of runtime exception
 * is checked exception
 * If you want your consumer should handle the exception then throw Checked Exception
 * If your consumer can't do anything of the exception then throw Runtime Exception
 */
public class CheckedExceptionExample {

    public static void main(String[] args) {
        // Checked Exception
        // Unhandled exception: java.lang.InterruptedException
        //Thread.sleep(2000);


        // Handling with try catch
        try {
            method1();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void method1() throws InterruptedException {
        // Throwing exception and calling function will need to take care
        Thread.sleep(2000);
    }
}
