package ru.job4j.tracker;

public class DeletedItem implements UserAction {

    private final Output output;

    public DeletedItem(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
       return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            output.println("Item id " + id + " was deleted");
        } else {
            output.println("Id doesn't exist");
        }
        return true;
    }
}


