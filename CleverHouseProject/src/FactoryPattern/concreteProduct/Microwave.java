package FactoryPattern.concreteProduct;


import FactoryPattern.Product.Oven;

public class Microwave implements Oven {
    private boolean on = false;
    private int time = 0;
    private int power = 0;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setTime(int minutes) {
        if(time > 30){
            this.time = 30;
        }else if(time < 0){
            this.time = 0;
        }else
            this.time = minutes;
    }

    @Override
    public int getHeatingTypeValue() {
        return power;
    }

    @Override
    public void setHeatingType(int value) {
        if(power > 800){
            this.power = 800;
        }else if(power < 0){
            this.power = 0;
        }else
            this.power = value;
    }

    @Override
    public void info() {
        System.out.println("\nThis is microwave.\n" +
                "Now " + (on ? "turn on.\n" : "turn off.\n")+
                "Time: " + time + " minutes.\n" +
                "Power: " + power +" watt.\n");
    }
}
