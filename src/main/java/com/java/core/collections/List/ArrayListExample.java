package com.java.core.collections.List;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements all optional list operations, and permits all elements, including null
 * This class is roughly equivalent to Vector, except that it is unsynchronized
 * The size, isEmpty, get, set, iterator, and listIterator operations run in constant time
 * All of the other operations run in linear time
 * Use Iterator to modify the list, for or enhanced for loop will not work
 * Primitive get autobox to wrapper classes when we store them in list
 */

@Slf4j
public class ArrayListExample {

    ArrayList<String> fruits = new ArrayList<>();

    public static void main(String[] args) {
        ArrayListExample arrayList = new ArrayListExample();

        arrayList.addFruits();

        arrayList.cloneArrayList();

        arrayList.ensureCapacity(100);

        arrayList.forEach();

        arrayList.removeIf();

        arrayList.trimToSize();
    }


    // Add some fruits to the list
    public void addFruits() {
        // "Apple", "Mango", "Pear"
        fruits.add("mango");
        fruits.add("pear");
        fruits.add("apple");
        log.info(fruits.toString());
    }

    // Returns a shallow copy of this ArrayList instance.
    // In shallow copy it copes field by field and if field is reference to an object
    // it copies the reference that means both original and clone point to same object
    // if any one change it, it reflects in other, primitive values are copies
    public void cloneArrayList() {
        ArrayList cloneList;
        cloneList = (ArrayList) fruits.clone();
        log.info(String.valueOf(cloneList));
    }


    // Increases the capacity of this ArrayList instance, if necessary,
    // to ensure that it can hold at least the number of elements specified
    // by the minimum capacity argument.
    public void ensureCapacity(int minCapacity) {
        fruits.ensureCapacity(minCapacity);
    }

    // Performs the given action for each element of the Iterable until all elements have been processed
    // or the action throws an exception.
    public void forEach() {
        fruits.forEach(fruit -> {
            log.info(fruit.toUpperCase());
        });
    }

    // Removes all of the elements of this collection that satisfy the given predicate.
    public void removeIf() {
        fruits.removeIf(fruit -> fruit.equalsIgnoreCase("pear"));
        log.info(fruits.toString());
    }

    // Removes from this list all of the elements whose index is between fromIndex,
    // inclusive, and toIndex, exclusive, its protected
    // Class need to extends ArrayList in order to use this function like arr.removeRange(0, 2);


    // Trims the capacity of this ArrayList instance to be the list's current size.
    public void trimToSize() {
        fruits.trimToSize();
        log.info(String.valueOf(fruits.size()));
    }

    // removeFirst(): Removes and returns the first element from this list.
    // removeLast(): Removes and returns the last element from this list.

    // removeFirstOccurrence(Object o): Removes the first occurrence of the
    // specified element in this list
    // removeLastOccurrence(Object o): Removes the last occurrence of the
    // specified element in this list

}
