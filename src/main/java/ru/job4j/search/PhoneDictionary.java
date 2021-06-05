package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combineName = i -> i.getName().contains(key);
        Predicate<Person> combineSurname = i -> i.getSurname().contains(key);
        Predicate<Person> combinePhone = i -> i.getPhone().contains(key);
        Predicate<Person> combineAddress = i -> i.getAddress().contains(key);
        Predicate<Person> combine = combineName.or(combineSurname).or(combinePhone).or(combineAddress);
        ArrayList<Person> result = new ArrayList<>();
            for (Person person : persons) {
                if (combine.test(person)) {
                    result.add(person);
                }
            }
            return result;
    }
}

