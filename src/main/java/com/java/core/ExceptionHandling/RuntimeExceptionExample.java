package com.java.core.ExceptionHandling;

/**
 *  If you want your consumer should handle the exception then throw Checked Exception
 *  If your consumer can't do anything of the exception then throw Runtime Exception
 */
public class RuntimeExceptionExample {

    public static void main(String[] args) {
        // This method throws RuntimeException
        method1();
    }

    private static void method1() throws RuntimeException{
    }
}
