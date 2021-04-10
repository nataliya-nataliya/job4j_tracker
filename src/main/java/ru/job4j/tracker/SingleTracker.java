package ru.job4j.tracker;

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

    /* реализовать singleton */

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return null;
    }

    public Item findByName(Item[] found) {
        return null;
    }

    public Item deletedItem(int id) {
        return null;
    }

    public  Item editItemAction(int id, Item item){
        return null;

    }

    public  Item showAction(Item[] items){
        return null;

    }

    public void exitProgram() {

    }


    /* Остальные методы из класса Tracker. */
}
