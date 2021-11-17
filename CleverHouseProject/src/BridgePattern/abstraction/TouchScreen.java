package BridgePattern.abstraction;

public interface TouchScreen {
    void power();
    void increaseTime(int time);
    void decreaseTime(int time);
    void increaseHeatingTypeValue(int value);
    void decreaseHeatingTypeValue(int value);
}
