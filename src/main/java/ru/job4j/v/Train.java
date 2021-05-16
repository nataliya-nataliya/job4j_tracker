package ru.job4j.v;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по рельсам");
    }

    @Override
    public void carriesPassengers() {
        System.out.println(getClass().getSimpleName() + " перевозит больше 200 пассажиров");

    }
}
