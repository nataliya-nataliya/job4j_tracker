package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public final class SingleTracker {
    private Tracker tracker = new Tracker();

    public  static SingleTracker instance  = null;

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }
    private SingleTracker() {

    };

    public Item add(Item item) {

        return tracker.add(item);
    }

    public Item findById(int id) {

        return tracker.findById(id);
    }

    public List<Item> findByName(String name) {
        return tracker.findByName(name);
    }

    public boolean deletedItem(int id) {
        return tracker.delete(id);
    }

    public  boolean editItemAction(int id, Item item){
        return tracker.replace(id, item);

    }

    public  List<Item> showAction(){
        return tracker.findAll();
    }
}

