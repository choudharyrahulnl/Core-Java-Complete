package com.java.core.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * The Array class provides static methods to dynamically create and access Java arrays
 * Default initialization in array for int is 0, for double 0.0, for boolean false, for objects null
 */

@Slf4j
public class ArrayExample {

    int[] marks = {75,60,56,82,80};

    public static void main(String[] args) {

        ArrayExample array = new ArrayExample();

        // array.loopOverArray();

        array.get(1);
        array.set(1, 65);

        array.length();

        array.values(1);
        array.values(1,2);
        array.values(1,2,3);
        array.values(1,2,3,4);
    }

    public void loopOverArray() {
        for (int i = 0; i < marks.length; i++) {
            log.info(String.valueOf(marks[i]));
        }
    }

    public void get(int index) {
        log.info(String.valueOf(marks[index]));
    }

    public void set(int index, int mark) {
        marks[index] = mark;
        log.info(Arrays.toString(marks));
    }

    public void length() {
        log.info(String.valueOf(marks.length));
    }

    // Variable argument should be the last argument
    public void values(int... values) {
        log.info(Arrays.toString(values));
    }

}
