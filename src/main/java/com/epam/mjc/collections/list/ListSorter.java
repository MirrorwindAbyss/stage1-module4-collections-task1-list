package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int valueA = calculateFunctionValue(a);
        int valueB = calculateFunctionValue(b);

        if (valueA == valueB) {
            return a.compareTo(b); // Sort in ascending order if function values are the same
        } else {
            return Integer.compare(valueA, valueB); // Sort based on function values
        }
    }

    private int calculateFunctionValue(String number) {
        int x = Integer.parseInt(number);
        return (5 * x * x) + 3;
    }
}
