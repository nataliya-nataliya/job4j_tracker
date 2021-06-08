package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(-5);
        list.add(-2);
        list.add(0);
        list.add(4);

        List<Integer> positiveNum = list.stream().filter(x -> x > 0).collect(Collectors.toList());
        positiveNum.forEach(System.out::println);
    }
}
