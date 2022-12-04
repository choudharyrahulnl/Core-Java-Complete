package com.java.core.collections.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * A collection that contains no duplicate elements
 * Contains at most one null element.
 * Order is not maintain because it uses hashcode
 */
public class SetExample {

    Set<String> fruits = new HashSet<>();

    // 	add(E e): Adds the specified element to this set if it is not already present
    // 	addAll(Collection c): Adds all of the elements in the specified collection to
    // 	this set if they're not already present

    // clear(): Removes all of the elements from this set

    // contains(Object o): Returns true if this set contains the specified element.
    // containsAll(Collection<?> c): Returns true if this set contains all of the
    // elements of the specified collection

    // copyOf(Collection<? extends E> coll): Returns an unmodifiable Set containing
    // the elements of the given Collection

    // isEmpty(): Returns true if this set contains no elements.

    // iterator(): Returns an iterator over the elements in this set.

    // Set.of(): Returns an unmodifiable set containing zero elements.
    // Set.of(Element e): Returns an unmodifiable set containing one element.
    // Set.of(E... elements): Returns an unmodifiable set containing an arbitrary number of elements.

    // remove(Object o): Removes the specified element from this set if it is present
    // removeAll(Object o): Removes all of this collection's elements that are also
    // contained in the specified collection
    // removeIf(Predicate<? super E> filter): Removes all of the elements of this collection
    // that satisfy the given predicate.

    // retainAll(Collection<?> c): Retains only the elements in this collection that are contained
    // in the specified collection

    // size(): Returns the number of elements in this set (its cardinality).

    // toArray(): Returns an array containing all of the elements in this set
}
