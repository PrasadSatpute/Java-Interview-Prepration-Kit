package org.example.prototype;

public class Bike implements Cloneable{
    private int speed;
    private String power;
    private int Mileage;
    private String tierType;

    public Bike() {
    }

    public Bike(int speed, String power, int mileage, String tierType) {
        this.speed = speed;
        this.power = power;
        Mileage = mileage;
        this.tierType = tierType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getMileage() {
        return Mileage;
    }

    public void setMileage(int mileage) {
        Mileage = mileage;
    }

    public String getTierType() {
        return tierType;
    }

    public void setTierType(String tierType) {
        this.tierType = tierType;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "speed=" + speed +
                ", power='" + power + '\'' +
                ", Mileage=" + Mileage +
                ", tierType='" + tierType + '\'' +
                '}';
    }

    public void setPowerComplexAndTimeTakingProcess(String s) throws InterruptedException {
        Thread.sleep(5000);
        this.power = s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
