package com.java.core.collections.Set;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * It makes no guarantees as to the iteration order of the set
 * This class offers constant time performance for the basic operations (add, remove, contains and size)
 *
 */

@Slf4j
public class HashSetExample {

    // All are from Set Interface

    Set<String> fruits = new HashSet<>();

    public static void main(String[] args) {
        HashSetExample hashSet = new HashSetExample();
        hashSet.addFruits();
    }

    // Add some fruits to the list
    public void addFruits() {
        // "Apple", "Mango", "Pear"
        fruits.add("mango");
        fruits.add("pear");
        fruits.add("apple");
        log.info(fruits.toString());
    }
}
