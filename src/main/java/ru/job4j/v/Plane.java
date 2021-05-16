package ru.job4j.v;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }

    @Override
    public void carriesPassengers() {
        System.out.println(getClass().getSimpleName() + " перевозит до 200 человек");

    }
}
