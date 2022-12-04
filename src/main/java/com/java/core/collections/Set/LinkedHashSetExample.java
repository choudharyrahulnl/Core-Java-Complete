package com.java.core.collections.Set;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Order of insertion is maintained
 */

@Slf4j
public class LinkedHashSetExample {

    Set<String> fruits = new LinkedHashSet<>();

    public static void main(String[] args) {
        LinkedHashSetExample linkedHashSet = new LinkedHashSetExample();
        linkedHashSet.addFruits();
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
