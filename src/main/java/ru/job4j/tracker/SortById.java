package ru.job4j.tracker;

import java.util.Comparator;

public class SortById implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return String.valueOf(first.getId()).compareTo(String.valueOf(second.getId()));
    }
}
