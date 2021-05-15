package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int diff = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            diff += Integer.compare(left.charAt(i), right.charAt(i));
            if (diff != 0) {
                return diff;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}