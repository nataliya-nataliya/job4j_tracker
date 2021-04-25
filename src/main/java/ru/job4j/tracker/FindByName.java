package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindByName implements UserAction{

    private final Output output;

    public FindByName(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute (Input input, Tracker tracker) {
        output.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        List<Item> found = tracker.findByName(name);
        if (found.size() > 0) {
            for (Item rsl : found) {
                output.println(rsl);
            }
        } else {
            output.println("Item name  " + name + " doesn't find");
        }
        return true;
    }
}


