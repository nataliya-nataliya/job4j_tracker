package ru.job4j.tracker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Tracker {

    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
                if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }
    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (int index = 0; index < items.size(); index++) {
            Item item = this.items.get(index);
            if(item.getName().equals(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }
        public List<Item> findAll() {
            List<Item> rsl = items;
            return rsl;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items.get(index) : null; //.getID
    }

    public boolean replace(int id, Item item) {
        int i = indexOf(id);
        boolean rsl = i != -1;
        if (rsl) {
            item.setId(id);
            items.set(i, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int i = indexOf(id);
        boolean rsl = i != -1;
        if (rsl) {
            items.remove(i);
        }
            return rsl;
    }
}



