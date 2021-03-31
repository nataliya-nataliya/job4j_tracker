package ru.job4j.tracker;

public class FindById implements UserAction{

    private final Output output;

    public FindById(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute (Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        int id = input.askInt("Enter id: ");
        Item find = tracker.findById(id);
        if (find != null) {
            System.out.println(find);
        } else {
            System.out.println("Item id " + id + " doesn't find");
        }
        return true;
    }
}

