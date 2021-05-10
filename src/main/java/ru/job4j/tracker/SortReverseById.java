package ru.job4j.tracker;

import java.util.Comparator;

public class SortReverseById implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return String.valueOf(second.getId()).compareTo(String.valueOf(first.getId()));
    }
}
