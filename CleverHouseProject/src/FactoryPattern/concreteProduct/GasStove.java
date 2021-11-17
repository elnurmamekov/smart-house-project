package FactoryPattern.concreteProduct;


import FactoryPattern.product.Oven;

public class GasStove implements Oven {
    private boolean on = false;
    private int time = 0;
    private int temperature = 0;

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
        if(time > 180){
            this.time = 180;
        }else if(time < 0){
            this.time = 0;
        }else
            this.time = minutes;
    }

    @Override
    public int getHeatingTypeValue() {
        return temperature;
    }

    @Override
    public void setHeatingType(int value) {
        if(temperature > 250){
            this.temperature = 250;
        }else if(temperature < 0){
            this.temperature = 0;
        }else
            this.temperature = value;
    }

    @Override
    public void info() {
        System.out.println("This is GasStove's oven.\n" +
                "Now " + (on ? "turn on.\n" : "turn off.\n")+
                "Time: " + time + " minutes.\n" +
                "Power: " + temperature +" celsius.\n");
    }
}
