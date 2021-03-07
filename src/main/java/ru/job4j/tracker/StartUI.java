package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI extends Item {

    public static void main(String[] args) {
        StartUI item = new StartUI();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.getCreated().format(formatter);
        System.out.println(currentDateTimeFormat);
    }
}

