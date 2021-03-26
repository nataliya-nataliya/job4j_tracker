package ru.job4j.tracker;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Item named: " + name + " was created");
    }

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item id " + id + " was edited on " + name);
        } else {
            System.out.println("Id doesn't exist");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item id " + id + " was deleted");
        } else {
            System.out.println("Id doesn't exist");
        }
    }
    public  static void findById (Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        int id = input.askInt("Enter id: ");
        Item find = tracker.findById(id);
        if (find != null) {
            System.out.println(find);
        } else {
            System.out.println("Item id " + id + " doesn't find");
        }
    }
    public static void findByName (Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item [] found = tracker.findByName(name);
        if(found.length > 0) {
            for (Item rsl : found) {
                System.out.println(rsl);
            }
        }
        else {
            System.out.println("Item name  " + name + " doesn't find");
        }
    }
    public static void exitProgram(Input input, Tracker tracker) {
        System.out.println("Program completed");
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            }
            else if (select == 1) {
                StartUI.showAllItems(input,tracker);
            }
            else if (select == 2) {
                StartUI.replaceItem(input,tracker);
            }
            else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            }
            else if (select == 4) {
                StartUI.findById(input, tracker);
            }
            else if (select == 5) {
                StartUI.findByName(input, tracker);
            }
             else if (select == 6) {
                StartUI.exitProgram(input, tracker);
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}



