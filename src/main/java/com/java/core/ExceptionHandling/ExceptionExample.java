package com.java.core.ExceptionHandling;

import lombok.extern.slf4j.Slf4j;

/**
 * Might occur due to bad code or our expectation like directory should be there
 *
 * If expectation does not meet, clearly highlight that, using exception handling
 *
 * Give friendly message to the end user & give enough information to debug the problem
 *
 * Finally will not run only if code in finally block throw error before we close something
 * or jvm crash like using Systems.exit(1)
 *
 * Try can run without catch but with finally, try require either catch or finally
 *
 * Class Error extends Throwable : We can't control, neither handle this
 * Class Exception extends Throwable
 * Class InterruptedException extends Exception : Checked Exception
 * Class Runtime Exception extends Exception : Runtime Exception
 * Class NullPointerException Exception extends Exception : Checked Exception
 *
 * If you want your consumer should handle the exception then throw Checked Exception
 * If your consumer can't do anything of the exception then throw Runtime Exception
 *
 * Best Practice:
 * Never hide exception
 * Do not use it for flow control
 * Think about your user
 * Think about your support team
 * Think about the calling method
 * Have global exception handling
 */

@Slf4j
public class ExceptionExample {

    /**
     * Not Handling Exception
     */

//    public static void main(String[] args) {
//
//        // If exceptions are not handled it will be thrown up in the chain and line after that won't execute
//        // line after that won't execute in method where execution occur + chain up methods next line won't execute
//        // line after that won't execute, will cause number of problems
//        method1(); // exception occur
//        log.info("Main Ended"); // will not run
//    }
//
//    private static void method1() {
//        method2(); // exception occur
//        log.info("Method-1 Ended"); // will not run
//    }
//
//    private static void method2() {
//        // Exception in thread "main" java.lang.NullPointerException
//        String str = null;
//        str.length(); // exception occur
//        log.info("Method-2 Ended"); // will not run
//    }

    /**
     * Handling Exception
     */
    public static void main(String[] args) {

        method1();
        log.info("Main Ended"); // print Main Ended
    }

    private static void method1() {
        method2();
        log.info("Method-1 Ended"); // print Method-1 Ended
    }

    private static void method2() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException  ex) {
            // If you don't do anything here then exception will be eaten up & nobody knows what happened
            // Print Method-1 Ended follows Main Ended
            // We should print the exception
            ex.printStackTrace(); // exception handled and flow goes to next line
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        log.info("Method-2 Ended"); // flows goes to the calling method
    }

}
