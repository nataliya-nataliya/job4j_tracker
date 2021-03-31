package ru.job4j.tracker;

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
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] found = tracker.findByName(name);
        if (found.length > 0) {
            for (Item rsl : found) {
                System.out.println(rsl);
            }
        } else {
            System.out.println("Item name  " + name + " doesn't find");
        }
        return true;
    }
}
