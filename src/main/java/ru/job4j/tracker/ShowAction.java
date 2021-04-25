package ru.job4j.tracker;

import java.util.List;

public class ShowAction  implements UserAction{

    private  final Output output;

    public ShowAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Show all items ===");
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            output.println(item);
        }
        return true;
    }
}




