package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("application1");
        tracker.add(item);
        System.out.println(Arrays.toString(tracker.findByName("application1")));

        Item item1 = new Item();
        item1.setName("application2");
        tracker.add(item1);
        System.out.println(Arrays.toString(tracker.findByName("application2")));
    }
}


