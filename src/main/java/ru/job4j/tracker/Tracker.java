package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }
    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int newSize = 0;
        for (int index = 0; index < size; index++) {
            Item item = this.items[index];
            if(item.getName().equals(key)) {
                rsl[newSize++] = item;
            }
        }
        return Arrays.copyOf(rsl, newSize);
    }
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }
    public boolean replace(int id, Item item) {
        int i = indexOf(id);
        if (i == -1) {
            return false;
        }
        items[i] = item;
        items[i].setId(id);
            return true;
    }
    public boolean delete(int id) {
        int i = indexOf(id);
        if (i == -1) {
            return false;
        }
        System.arraycopy(items, i+1, items, i, size - 1);
        items[size - 1] = null;
        size--;
            return true;
    }
}