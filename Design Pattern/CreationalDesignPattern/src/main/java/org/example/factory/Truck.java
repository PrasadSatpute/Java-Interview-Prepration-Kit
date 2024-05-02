package org.example.factory;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by Land in Box");
    }
}
