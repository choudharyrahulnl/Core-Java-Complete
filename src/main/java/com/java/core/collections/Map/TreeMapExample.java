package com.java.core.collections.Map;

import lombok.extern.slf4j.Slf4j;

import java.util.TreeMap;

/**
 * Data stored in sorted order
 * Implements Navigable Map
 */

@Slf4j
public class TreeMapExample {

    TreeMap<String, Integer> items = new TreeMap();

    public static void main(String[] args) {
        TreeMapExample treeMap = new TreeMapExample();

        treeMap.addItems();

        treeMap.higherKey("B");
        treeMap.ceilingKey("B");

        treeMap.lowerKey("B");
        treeMap.floorKey("B");

        treeMap.firstEntry();
        treeMap.lastEntry();

        treeMap.subMap();
    }

    private void addItems() {
        items.put("F", 25);
        items.put("Z", 5);
        items.put("L", 250);
        items.put("A", 15);
        items.put("B", 25);
        items.put("G", 25);
        log.info(String.valueOf(items));
    }

    // Check for >
    private void higherKey(String key) {
        log.info(items.higherKey(key));
    }

    // Checks for >=
    private void ceilingKey(String key) {
        log.info(items.ceilingKey(key));
    }

    // Check for <
    private void lowerKey(String key) {
        log.info(items.lowerKey(key));
    }

    // Checks for <=
    private void floorKey(String key) {
        log.info(items.floorKey(key));
    }

    private void firstEntry() {
        log.info(String.valueOf(items.firstEntry()));
    }

    private void lastEntry() {
        log.info(String.valueOf(items.lastEntry()));
    }

    // (first-value-inclusive >= and second-value-exclusive <)
    private void subMap() {
        log.info(String.valueOf(items.subMap("C", "Y")));
    }

}
