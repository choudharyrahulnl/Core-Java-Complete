package com.java.core.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class consists exclusively of static methods that operate on or return collections
 * The methods of this class all throw a NullPointerException if the collections or
 * class objects provided to them are null.
 */

@Slf4j
public class CollectionsUtilExample {

    List<Integer> numbers = new ArrayList<>(List.of(4,2,3,1));

    public static void main(String[] args) {
        CollectionsUtilExample collections = new CollectionsUtilExample();

        collections.unmodifiableList();

        collections.sort();

        collections.swap(0,3);

        collections.singletonList(2);

        collections.shuffle();

        collections.rotate(1);
        collections.rotate(2);

        collections.reverse();

        collections.replaceAll(3,6);

        collections.max();
        collections.min();

        collections.indexOfSubList();

        collections.frequency(2);

        collections.disjoint();

        collections.binarySearch(2);

        collections.addAll();
    }

    // unmodifiableCollection(Collection<? extends T> c)
    // unmodifiableList(List<? extends T> list)
    // unmodifiableMap(Map<? extends K,? extends V> m)
    // unmodifiableNavigableMap(NavigableMap<K,? extends V> m)
    // unmodifiableNavigableSet(NavigableSet<T> s)
    // unmodifiableSet(Set<? extends T> s)
    // unmodifiableSortedMap(SortedMap<K,? extends V> m)
    // unmodifiableSortedSet(SortedSet<T> s)
    // Returns an unmodifiable view of the specified collection, list, map, navigable map, navigable set, set ...
    private void unmodifiableList() {
        List<Integer> integers = Collections.unmodifiableList(numbers);
        log.info(String.valueOf(integers));
    }

    // synchronizedCollection(Collection<? extends T> c)
    // synchronizedCollection(List<? extends T> list)
    // synchronizedCollection(Map<? extends K,? extends V> m)
    // synchronizedCollection(NavigableMap<K,? extends V> m)
    // synchronizedCollection(NavigableSet<T> s)
    // synchronizedCollection(Set<? extends T> s)
    // synchronizedCollection(SortedMap<K,? extends V> m)
    // synchronizedCollection(SortedSet<T> s)
    // Returns a synchronized (thread-safe) collection, list, map, navigable map, navigable set, set ...

    // Sorts the specified list into ascending order, according to the natural ordering of its elements.
    // sort(List<T> list, Comparator<? super T> c)
    //
    public void sort() {
        Collections.sort(numbers);
        log.info(String.valueOf(numbers));
    }

    // Swaps the elements at the specified positions in the specified list.
    public void swap(int i, int j) {
        Collections.swap(numbers, i, j);
        log.info(String.valueOf(numbers));
    }

    // Returns an immutable list containing only the specified object.
    // singleton(T o): Returns an immutable set containing only the specified object.
    public void singletonList(int number) {
        List<Integer> integers = Collections.singletonList(number);
        log.info(String.valueOf(integers));
    }

    // Randomly permutes the specified list using a default source of randomness.
    // shuffle(List<?> list, Random rnd): Randomly permute the specified list using the
    // specified source of randomness.
    public void shuffle() {
        Collections.shuffle(numbers);
        log.info(String.valueOf(numbers));
    }

    // Rotates the elements in the specified list by the specified distance.
    public void rotate(int rotateBy) {
        Collections.rotate(numbers, rotateBy);
        log.info(String.valueOf(numbers));
    }

    // Returns a comparator that imposes the reverse of the natural ordering on a collection
    // of objects that implement the Comparable interface.
    // reverseOrder(Comparator<T> cmp): Returns a comparator that imposes the reverse ordering
    // of the specified comparator.
    public void reverse() {
        Collections.reverse(numbers);
        log.info(String.valueOf(numbers));
    }

    // Replaces all occurrences of one specified value in a list with another.
    public void replaceAll(int oldValue, int newValue) {
        Collections.replaceAll(numbers, oldValue,newValue);
        log.info(String.valueOf(numbers));
    }

    // Returns the maximum element of the given collection, according to the natural ordering of its elements.
    // max(Collection<? extends T> coll, Comparator<? super T> comp)
    public void max() {
        log.info(String.valueOf(Collections.max(numbers)));
    }

    // Returns the minimum element of the given collection, according to the natural ordering of its elements.
    // min(Collection<? extends T> coll, Comparator<? super T> comp)
    public void min() {
        log.info(String.valueOf(Collections.min(numbers)));
    }

    // Returns the starting position of the first occurrence of the specified target list within the specified
    // source list, or -1 if there is no such occurrence.
    // lastIndexOfSubList(List<?> source, List<?> target)
    public void indexOfSubList() {
        sort();
        log.info(String.valueOf(Collections.indexOfSubList(numbers, List.of(2,4))));
    }

    // Returns the number of elements in the specified collection equal to the specified object.
    public void frequency(int number) {
        log.info(String.valueOf(Collections.frequency(numbers, number)));
    }

    // fill(List<? super T> list, T obj): Replaces all of the elements of the specified list
    // with the specified element.

    // Returns true if the two specified collections have no elements in common.
    public void disjoint() {
        log.info(String.valueOf(Collections.disjoint(numbers, List.of(2,4))));
        log.info(String.valueOf(Collections.disjoint(numbers, List.of(8,11))));
    }

    // copy(List<? super T> dest, List<? extends T> src): Copies all of the elements from one list into another.

    // Searches the specified list for the specified object using the binary search algorithm.
    // return index
    // binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
    public void binarySearch(int number) {
        log.info(String.valueOf(Collections.binarySearch(numbers, number)));
    }

    // Adds all of the specified elements to the specified collection.
    public void addAll() {
        log.info(String.valueOf(Collections.addAll(numbers, 8,9,10)));
    }
}
