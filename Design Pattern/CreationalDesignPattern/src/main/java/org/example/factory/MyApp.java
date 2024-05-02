package org.example.factory;

public class MyApp {
    public static void main(String[] args) {
        Transport truck = Factory.getTransport("Truck");
        truck.deliver();
        Transport ship = Factory.getTransport("Ship");
        ship.deliver();
    }
}
