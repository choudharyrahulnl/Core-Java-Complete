package com.java.core.collections.List;

import java.util.Comparator;

public class FruitsComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}