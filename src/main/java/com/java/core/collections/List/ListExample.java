package com.java.core.collections.List;


import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * An ordered collection (also known as a sequence)
 * Unlike sets, lists typically allow duplicate elements
 */

@Slf4j
public class ListExample {

    // List.of is immutable and can't be modified
    static List<String> moreFruits = List.of("oranges", "apricots");
    static List<String> someMoreFruits = List.of("peaches", "plums");
    List<String> fruits = new ArrayList<>();

    public static void main(String[] args) {
        ListExample list = new ListExample();

        list.addFruits();

        list.add("kiwi");
        list.add(1,"banana");

        list.get(0);

        list.addAll(1, moreFruits);
        list.addAll(someMoreFruits);

        list.clear();
        list.addFruits();

        list.contains("apple");
        list.containsAll(List.of("mango", "apple"));

        list.copyOf(List.of("mango", "apple"));

        list.equals("apple");

        list.getHashCode();

        list.indexOf("pear");
        list.lastIndexOf("pear");

        list.isEmpty();

        list.iterator();
        list.listIterator();
        list.listIterator(1);

        list.remove(0);
        list.remove("mango");
        list.removeAll(new ArrayList(Arrays.asList("pear")));

        list.addFruits();
        list.replaceAll();

        list.retainAll(new ArrayList(Arrays.asList("APPLE", "PEAR")));

        list.set(1,"PLUMS");

        list.size();

        list.clear();
        list.addFruits();
        list.sort();

        list.subList(0,2);

        list.toArray();

    }

    // Add some fruits to the list
    public void addFruits() {
        // "Apple", "Mango", "Pear"
        fruits.add("mango");
        fruits.add("pear");
        fruits.add("apple");
        log.info(fruits.toString());
    }

    // Inserts the specified element at the specified position in this list
    public void add(int index, String fruit) {
        fruits.add(index, fruit);
        log.info(fruits.toString());
    }

    // Appends the specified element to the end of this list
    public void add(String fruit) {
        fruits.add(fruit);
        log.info(fruits.toString());
    }

    // Inserts all of the elements in the specified collection into this list at the specified position
    public void addAll(int index, Collection fruit) {
        fruits.addAll(index, fruit);
        log.info(fruits.toString());
    }

    // Appends all of the elements in the specified collection to the end of this list
    public void addAll(Collection moreFruits) {
        fruits.addAll(moreFruits);
        log.info(fruits.toString());
    }

    // Returns the element at the specified position in this list
    public void get(int index) {
        log.info(fruits.get(index));
    }

    // Removes all of the elements from this list
    public void clear() {
        fruits.clear();
        log.info(fruits.toString());
    }

    // Returns true if this list contains the specified element
    public void contains(String fruit) {
        log.info(String.valueOf(fruits.contains(fruit)));
    }

    // Returns true if this list contains all of the elements of the specified collection.
    public void containsAll(Collection fruits) {
        log.info(String.valueOf(fruits.containsAll(fruits)));
    }

    // Returns an unmodifiable List containing the elements of the given Collection,
    // in its iteration order.
    public void copyOf(Collection fruits) {
        List list = List.copyOf(fruits);
        log.info(list.toString());
    }

    // Compares the specified object with this list for equality
    public void equals(String fruit) {
        log.info(String.valueOf(fruits.get(0).equals(fruit)));
    }

    // Returns the hash code value for this list
    public void getHashCode() {
        log.info(String.valueOf(fruits.hashCode()));
    }

    // Returns the index of the first occurrence of the specified element in this list,
    // or -1 if this list does not contain the element.
    public void indexOf(String fruit) {
        log.info(String.valueOf(fruits.indexOf(fruit)));
    }

    // Returns the index of the last occurrence of the specified element in this list,
    // or -1 if this list does not contain the element.

    public void lastIndexOf(String fruit) {
        log.info(String.valueOf(fruits.lastIndexOf(fruit)));
    }

    // Returns true if this list contains no elements
    public void isEmpty() {
        log.info(String.valueOf(fruits.isEmpty()));
    }

    // Returns an iterator over the elements in this list in proper sequence.
    // Only move in forward direction
    // hasNext(), next(), remove()
    // Used for List, Set, Queue
    public void iterator() {
        log.info("**********************");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            log.info(iterator.next());
        }
        log.info("**********************");
    }

    // Returns a list iterator over the elements in this list
    // Move in forward & backward direction
    // hasNext(), next(), hasPrevious(), previous(), add(), remove()
    // Used for List
    public void listIterator() {
        log.info("**********************");
        ListIterator<String> iterator = fruits.listIterator();
        // Forward
        while (iterator.hasNext()) {
            log.info(iterator.next());
        }
        // Backward
        while (iterator.hasPrevious()) {
            log.info(iterator.previous());
        }
        log.info("**********************");
    }

    // Returns a list iterator over the elements in this list (in proper sequence),
    // starting at the specified position in the list.
    public void listIterator(int index) {
        log.info("**********************");
        ListIterator<String> iterator = fruits.listIterator(index);
        // Forward
        while (iterator.hasNext()) {
            log.info(iterator.next());
        }
        log.info(".......");
        // Backward
        while (iterator.hasPrevious()) {
            log.info(iterator.previous());
        }
        log.info("**********************");
    }


    // List.of() Returns an unmodifiable list containing zero elements.
    // List.of(Element e) Returns an unmodifiable list containing one element.
    // List.of(E... elements) Returns an unmodifiable list containing an arbitrary number of elements.
    // List.of(Element e1, Element e2)Returns an unmodifiable list containing two elements


    // Removes the element at the specified position in this list
    public void remove(int index) {
        fruits.remove(index);
        log.info(fruits.toString());
    }

    // Removes the first occurrence of the specified element from this list, if it is present
    public void remove(String fruit) {
        fruits.remove(fruit);
        log.info(fruits.toString());
    }

    // Removes from this list all of its elements that are contained in the specified collection
    public void removeAll(Collection removeFruits) {
        fruits.removeAll(removeFruits);
        log.info(fruits.toString());
    }

    // Replaces each element of this list with the result of applying the operator to that element
    public void replaceAll() {
        fruits.replaceAll(fruit -> fruit.toUpperCase());
        log.info(fruits.toString());
    }

    // Retains only the elements in this list that are contained in the specified collection
    public void retainAll(Collection matchedFruits) {
        fruits.retainAll(matchedFruits);
        log.info(fruits.toString());
    }

    // Replaces the element at the specified position in this list with the specified element
    public void set(int index, String fruit) {
        fruits.set(index, fruit);
        log.info(fruits.toString());
    }

    // Returns the number of elements in this list
    public void size() {
        log.info(String.valueOf(fruits.size()));
    }

    // Sorts this list according to the order induced by the specified Comparator.
    // Comparable is used on objects that are naturally ordered,
    // object is considered comparable if its class uses the Comparable interface
    // By default, all the String and Wrapper classes implement the Comparable interface
    // Comparator interface implements sorting by taking the attributes of an object into consideration
    public void sort() {
        // Collections.sort(fruits); // This depends on comparable interface
        // Ex Collections.sort(studentList); // Student Domain implements comparable interface
        // Ex Collections.sort(studentList, new StudentComparator()); // StudentComparator implements comparator interface
        fruits.sort(new FruitsComparator()); // This depends on comparator interface
        log.info(String.valueOf(fruits.toString()));
    }

    // Returns a view of the portion of this list between the specified
    // fromIndex, inclusive, and toIndex, exclusive
    public void subList(int fromIndex, int toIndex) {
        log.info(String.valueOf(fruits.subList(fromIndex,toIndex)));
        log.info(String.valueOf(fruits.toString()));
    }

    // Returns an array containing all of the elements in this list in proper sequence
    public void toArray() {
        Object[] objects = fruits.toArray();
        log.info(Arrays.toString(objects));
    }

}

