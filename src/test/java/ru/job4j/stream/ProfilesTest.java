package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void listOfAddresses() {
        Address addr1 = new Address("Moscow", "Pushkina", 4, 9);
        Address addr2 = new Address("Kazan'", "Lenina", 90, 123);
        List<Profile> list = List.of(
                new Profile(addr1),
                new Profile(addr2)
        );
        Profiles prof = new Profiles();
        assertThat(prof.collect(list).toString(), is(
                "[Address{city='Moscow', street='Pushkina', home=4, apartment=9},"
                + " Address{city='Kazan'', street='Lenina', home=90, apartment=123}]"));

    }

    @Test
    public void dublicateAddresses() {
        Address addr1 = new Address("Moscow", "Pushkina", 4, 9);
        Address addr2 = new Address("Kazan'", "Lenina", 90, 123);
        Address addr3 = new Address("Moscow", "Pushkina", 4, 9);
        List<Profile> list = List.of(
                new Profile(addr1),
                new Profile(addr2),
                new Profile(addr3)
        );
        Profiles prof = new Profiles();
        assertThat(prof.dubcollect(list).toString(), is(
                "[Address{city='Kazan'', street='Lenina', home=90, apartment=123},"
                        + " Address{city='Moscow', street='Pushkina', home=4, apartment=9}]"));
    }
}