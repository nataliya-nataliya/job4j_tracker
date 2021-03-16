package ru.job4j.poly;

public class Bus implements Transport{

    @Override
    public void ride() {

    }

    @Override
    public void passengers(int number) {
        System.out.println("Число пассажиров" + number);
    }

    @Override
    public int price(int fuel) {
        return fuel * 45;
    }
}
