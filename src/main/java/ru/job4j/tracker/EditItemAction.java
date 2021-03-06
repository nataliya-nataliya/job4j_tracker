package ru.job4j.tracker;

public class EditItemAction implements UserAction {

    private final Output output;

    public EditItemAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Edit Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Edit item ===");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            output.println("Item id " + id + " was edited on " + name);
        } else {
            output.println("Id doesn't exist");
        }
        return true;
    }
}




