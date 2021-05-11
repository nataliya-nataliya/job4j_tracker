package ru.job4j.tracker;

import java.util.Comparator;

public class SortReverseById implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return Integer.valueOf(second.getId()).compareTo(Integer.valueOf(first.getId()));
    }
}
