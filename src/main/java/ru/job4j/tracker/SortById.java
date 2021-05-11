package ru.job4j.tracker;

import java.util.Comparator;

public class SortById implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return Integer.valueOf(first.getId()).compareTo(Integer.valueOf(second.getId()));
    }
}
