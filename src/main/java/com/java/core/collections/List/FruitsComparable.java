package com.java.core.collections.List;

import java.util.Comparator;

public class FruitsComparable implements Comparable<String> {


    @Override
    public int compareTo(String that) {
        // return that.compareTo(this); // In reverse order
        return this.compareTo(that);
    }
}