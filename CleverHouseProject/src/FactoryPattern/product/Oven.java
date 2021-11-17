package FactoryPattern.product;

public interface Oven {
    boolean isOn();
    void turnOff();
    void turnOn();
    int getTime();
    void setTime(int minutes);
    int getHeatingTypeValue();
    void setHeatingType(int value);
    void info();
}
