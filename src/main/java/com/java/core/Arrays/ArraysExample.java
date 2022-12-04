package com.java.core.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

/**
 * This class contains various methods for manipulating arrays (such as sorting and searching)
 *  This class also contains a static factory that allows arrays to be viewed as lists
 *  The methods in this class all throw a NullPointerException, if the specified
 *  array reference is null
 */

@Slf4j
public class ArraysExample {

    int[] numbers = new int[10];


    public static void main(String[] args) {
        ArraysExample arrays = new ArraysExample();

        arrays.addNumbers();

        arrays.asList();

        arrays.binarySearch(1);

        arrays.equals();

        arrays.fill();
    }

    public void addNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        log.info(Arrays.toString(numbers));
    }

    // Returns a fixed-size list backed by the specified array.
    public void asList() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        log.info(String.valueOf(integers));
    }

    // Searches the specified array of ints for the specified value using the
    // binary search algorithm, returns index of the search key
    // Array must be sorted
    // Arrays.binarySearch(byte[],key)
    // Arrays.binarySearch(char[],key)
    // Arrays.binarySearch(double[],key)
    // Arrays.binarySearch(float[],key)
    // Arrays.binarySearch(int[],key)
    // Arrays.binarySearch(long[],key)
    // Arrays.binarySearch(short[],key)
    public void binarySearch(int key) {
        log.info(String.valueOf(Arrays.binarySearch(numbers, key)));
    }

    public void equals() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = {4,2,3};
        log.info(String.valueOf(Arrays.equals(arr1,arr2)));
        log.info(String.valueOf(Arrays.equals(arr1,arr3)));
    }

    public void fill() {
        int[] numbers = new int[5];
        Arrays.fill(numbers, 2);
        log.info(Arrays.toString(numbers));
    }
}
