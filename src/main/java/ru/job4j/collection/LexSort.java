package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[]dotLeft = left.split("\\.");
        String[]dotRight = right.split("\\.");
        return Integer.compare(Integer.parseInt(dotLeft[0]), Integer.parseInt(dotRight[0]));
    }
}
