package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import java.util.ArrayList;
import java.util.List;

public class StartUITest {

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name1"));
        Input in = new StubInput(
                new String[]{"0", item.getName(), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindByName(out));
        actions.add(new ExitProgram(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                  "Menu." + System.lineSeparator()
                          + "0. Find items by name" + System.lineSeparator()
                          + "1. Exit" + System.lineSeparator()
                          + "=== Find items by name ====" + System.lineSeparator()
                          + item + System.lineSeparator()
                          + "Menu." + System.lineSeparator()
                          + "0. Find items by name" + System.lineSeparator()
                          + "1. Exit" + System.lineSeparator()
                          + "Program completed" + System.lineSeparator()
                ));
    }

    @Test
    public void whenFindByID() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name1"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindById(out));
        actions.add(new ExitProgram(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                  "Menu." + System.lineSeparator()
                          + "0. Find item by Id" + System.lineSeparator()
                          + "1. Exit" + System.lineSeparator()
                          + "=== Find item by Id ===" + System.lineSeparator()
                          + item + System.lineSeparator()
                          + "Menu." + System.lineSeparator()
                          + "0. Find item by Id" + System.lineSeparator()
                          + "1. Exit" + System.lineSeparator()
                          + "Program completed" + System.lineSeparator()
        ));
    }

    @Test
    public void whenShowAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name1"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ShowAction(out));
        actions.add(new ExitProgram(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Show all items" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Show all items ===" + System.lineSeparator()
                        + item + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Show all items" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "Program completed" + System.lineSeparator()
        ));
    }

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new ExitProgram(out));
        new StartUI(out).init(in, tracker, actions);
        //assertThat(tracker.findAll()[0].getName(), is("Item name"));
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new EditItemAction(out));
        actions.add(new ExitProgram(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new DeletedItem(out));
        actions.add(new ExitProgram(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitProgram(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
                        + "Program completed" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"7", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitProgram(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit" + ln
                        + "Program completed" + ln
                )
        );
    }
}
