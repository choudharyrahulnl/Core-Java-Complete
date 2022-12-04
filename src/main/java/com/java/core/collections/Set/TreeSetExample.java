package com.java.core.collections.Set;

import lombok.extern.slf4j.Slf4j;

import java.util.Set;
import java.util.TreeSet;

/**
 * The elements are ordered using their natural ordering
 * or by a Comparator provided at set creation time, depending on which constructor is used.
 * This implementation provides guaranteed log(n) time cost for the basic operations (add, remove and contains).
 * TreeSet implements Set & NavigableSet
 */

@Slf4j
public class TreeSetExample {

    Set<String> fruits = new TreeSet<>();

    public static void main(String[] args) {
        TreeSetExample treeSet = new TreeSetExample();
        treeSet.addFruits();
    }

    // Add some fruits to the list
    public void addFruits() {
        // "Apple", "Mango", "Pear"
        fruits.add("mango");
        fruits.add("pear");
        fruits.add("apple");
        log.info(fruits.toString());
    }

    // ceiling(E e): Returns the least element in this set greater than or equal to the given element,
    // or null if there is no such element. example numbers.ceiling(54) will give 54 [12,34,54,65,99]
    // higher(E e): Returns the least element in this set strictly greater than the given element,
    // or null if there is no such element. example numbers.ceiling(54) will give 65 [12,34,54,65,99]
    // floor(E e): Returns the greatest element in this set less than or equal to the given element,
    // or null if there is no such element. example numbers.floor(40) will give 34 [12,34,54,65,99]
    // lower(E e): Returns the greatest element in this set strictly less than the given element,
    // or null if there is no such element. numbers.floor(34) will give 12 [12,34,54,65,99]

    // subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive): Returns a view of the
    // portion of this set whose elements range from fromElement to toElement.
    // example numbers.subset(20, 80) will give [34,54,65] [12,34,54,65,99]

    // headSet(E toElement): Returns a view of the portion of this set whose elements are strictly less than toElement.
    // example numbers.headSet(50) will give [12,34] from [12,34,54,65,99]
    // headSet(E toElement, boolean inclusive): Returns a view of the portion of this set whose elements are
    // less than (or equal to, if inclusive is true) toElement.

    // pollFirst(): Retrieves and removes the first (lowest) element, or returns null if this set is empty.
    // pollLast(): Retrieves and removes the last (highest) element, or returns null if this set is empty.

    // tailSet(E fromElement): Returns a view of the portion of this set whose elements are greater than or equal
    // to fromElement. example numbers.tailSet(50) will give [54,65,99] from [12,34,54,65,99]
    // tailSet(E fromElement, boolean inclusive): Returns a view of the portion of this set whose elements are
    // greater than (or equal to, if inclusive is true) fromElement.
}
