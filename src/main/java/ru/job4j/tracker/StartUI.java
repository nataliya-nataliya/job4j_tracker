package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("application");
        tracker.add(item);
        System.out.println(Arrays.toString(tracker.findByName("application")));
    }
}


