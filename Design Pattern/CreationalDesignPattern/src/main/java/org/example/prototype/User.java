package org.example.prototype;

public class User {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Bike b1 = new Bike();
        b1.setSpeed(350);
        b1.setPowerComplexAndTimeTakingProcess("1200Hp");
        b1.setMileage(25);
        b1.setTierType("Racing");
        System.out.println(b1);

        try {
            Bike b2 = (Bike)b1.clone();
            b2.setTierType("Off-Road");
            System.out.println(b2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
