package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item named: " + name + " was created");
            }
            else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item);
                }
            }
            else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item id " + id + " was edited on " + name);
                } else {
                    System.out.println("Id doesn't exist");
                }
            }
            else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Item id " + id + " was deleted");
                } else {
                    System.out.println("Id doesn't exist");
                }
            }
            else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item find = tracker.findById(id);
                if (find != null) {
                    System.out.println(find);
                } else {
                    System.out.println("Item id " + id + " doesn't find");
                }
            }
            else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
             else if (select == 6) {
                System.out.println("Program completed");
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
   /* public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("application1");
        tracker.add(item);
        System.out.println(Arrays.toString(tracker.findByName("application1")));

        Item item1 = new Item();
        item1.setName("application2");
        tracker.add(item1);
        System.out.println(Arrays.toString(tracker.findByName("application2")));
    }*/



