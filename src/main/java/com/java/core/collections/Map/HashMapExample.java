package com.java.core.collections.Map;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Hash table based implementation of the Map interface
 * It permits null values and the null key.
 * The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.
 * This class makes no guarantees as to the order of the map; in particular,
 * This implementation provides constant-time performance for the basic operations (get and put),
 * Unsorted and Unordered
 */

@Slf4j
public class HashMapExample {

    HashMap<String,Integer> timesOccur = new HashMap<>();

    public static void main(String[] args) {
        HashMapExample hashMap = new HashMapExample();

        hashMap.addItems();

        hashMap.containsKey("a");
        hashMap.containsValue(4);

        hashMap.get("c");
        hashMap.getOrDefault("f",1);

        hashMap.keySet();
        hashMap.values();
        hashMap.entrySet();

        hashMap.put("f", 1);
        hashMap.putIfAbsent("g", 3);
        hashMap.putAll(Map.of("z",12, "s", 34));

        hashMap.remove("z");
        hashMap.remove("s", 34);

        hashMap.replace("g", 4);
        hashMap.replace("g", 4, 5);
        hashMap.replaceAll();

        hashMap.isEmpty();
        hashMap.size();

        hashMap.forEach();

        hashMap.merge(new HashMap(Map.of("a",4, "b", 2)));

    }

    private void addItems() {
        timesOccur.put("a", 3);
        timesOccur.put("b", 1);
        timesOccur.put("c", 2);
        timesOccur.put("d", 4);
        log.info(String.valueOf(timesOccur));
    }

    private void containsKey(String key) {
        log.info(String.valueOf(timesOccur.containsKey(key)));
    }

    private void containsValue(Integer value) {
        log.info(String.valueOf(timesOccur.containsValue(value)));
    }

    private void get(String key) {
        log.info(String.valueOf(timesOccur.get(key)));
    }

    private void getOrDefault(String key, Integer value) {
        log.info(String.valueOf(timesOccur.getOrDefault(key,value)));
    }

    private void put(String key, Integer value) {
        timesOccur.put(key,value);
        log.info(String.valueOf(timesOccur));
    }

    private void putIfAbsent(String key, Integer value) {
        timesOccur.putIfAbsent(key,value);
        log.info(String.valueOf(timesOccur));
    }

    private void putAll(Map map) {
        timesOccur.putAll(map);
        log.info(String.valueOf(timesOccur));
    }

    private void keySet() {
        log.info(String.valueOf(timesOccur.keySet()));
    }

    private void values() {
        log.info(String.valueOf(timesOccur.values()));
    }

    private void entrySet() {
        log.info(String.valueOf(timesOccur.entrySet()));
    }

    private void remove(String key) {
        timesOccur.remove(key);
        log.info(String.valueOf(timesOccur));
    }

    private void remove(String key, Integer value) {
        timesOccur.remove(key, value);
        log.info(String.valueOf(timesOccur));
    }

    private void replace(String key, Integer value) {
        timesOccur.replace(key, value);
        log.info(String.valueOf(timesOccur));
    }

    private void replace(String key, Integer oldValue, Integer newValue) {
        timesOccur.replace(key, oldValue, newValue);
        log.info(String.valueOf(timesOccur));
    }

    private void replaceAll() {
        timesOccur.replaceAll((key, oldValue) -> oldValue * oldValue);
        log.info(String.valueOf(timesOccur));
    }

    private void isEmpty() {
        log.info(String.valueOf(timesOccur.isEmpty()));
    }

    private void size() {
        log.info(String.valueOf(timesOccur.size()));
    }

    private void forEach() {
        timesOccur.forEach((key,value) -> {
            log.info("{Key: " + key + ", Value: " + value + "}");
        });
    }

    private void merge(Map map) {
        timesOccur.forEach(
                (key, value)
                        -> map.merge(
                        key,
                        value,
                        (v1, v2)
                                -> {
                            return v1.toString().equalsIgnoreCase(v2.toString()) ? v1 : v1 + ", " + v2;
                        }));
        log.info(String.valueOf(map));
    }


}
