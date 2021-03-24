package ru.job4j.v;

public class UseVehicle {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Plane plane = new Plane();
        Train train = new Train();
        Vehicle[] transport = new Vehicle[]{bus, plane, train};
        for (Vehicle veh : transport) {
            veh.move();
            veh.carriesPassengers();
        }
    }
}
