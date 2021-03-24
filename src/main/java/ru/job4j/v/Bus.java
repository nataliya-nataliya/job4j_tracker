package ru.job4j.v;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дороге");
    }

    @Override
    public void carriesPassengers() {
        System.out.println(getClass().getSimpleName() + " перевозит до 60 пассажиров");

    }
}
