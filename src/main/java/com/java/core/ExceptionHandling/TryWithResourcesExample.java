package com.java.core.ExceptionHandling;

import java.sql.SQLClientInfoException;
import java.util.Scanner;

/**
 * Classes which implements Interface Closeable we can use in try with resources
 */

public class TryWithResourcesExample {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = {1,2,3,4};
            int number = numbers[5];
        } catch (IndexOutOfBoundsException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
