package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemTest {

    @Test
    public void sortByName() {
        Item name1 = new Item(1,"Olga");
        Item name2 = new Item(2,"Ekaterina");
        Item name3 = new Item(3,"Ivan");
        List<Item> namesBefore = Arrays.asList(name1,name2, name3);
        List<Item> namesAfter = Arrays.asList(name2, name3, name1);
        Collections.sort(namesBefore, new SortByName());
        assertThat(namesBefore, is(namesAfter));
    }

    @Test
    public void sortReverseByName() {
        Item name1 = new Item(1,"Olga");
        Item name2 = new Item(2,"Ekaterina");
        Item name3 = new Item(3,"Ivan");
        List<Item> namesBefore = Arrays.asList(name1,name2, name3);
        List<Item> namesAfter = Arrays.asList(name1, name3, name2);
        Collections.sort(namesBefore, new SortReverseByName());
        assertThat(namesBefore, is(namesAfter));
    }

    @Test
    public void sortById() {
        Item id1 = new Item(2,"Olga");
        Item id2 = new Item(3,"Ekaterina");
        Item id3 = new Item(1,"Ivan");
        List<Item> idBefore = Arrays.asList(id1, id2, id3);
        List<Item> idAfter = Arrays.asList(id3, id1, id2);
        Collections.sort(idBefore, new SortById());
        assertThat(idBefore, is(idAfter));
    }
    @Test
    public void sortReverseById() {
        Item id1 = new Item(2,"Olga");
        Item id2 = new Item(3,"Ekaterina");
        Item id3 = new Item(1,"Ivan");
        List<Item> idBefore = Arrays.asList(id1, id2, id3);
        List<Item> idAfter = Arrays.asList(id2, id1, id3);
        Collections.sort(idBefore, new SortReverseById());
        assertThat(idBefore, is(idAfter));
    }
}