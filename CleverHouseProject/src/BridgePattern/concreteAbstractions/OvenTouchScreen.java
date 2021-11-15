package BridgePattern.concreteAbstractions;


import BridgePattern.Abstraction.TouchScreen;
import FactoryPattern.Product.Oven;

public class OvenTouchScreen implements TouchScreen {
    private Oven oven;

    public OvenTouchScreen(){}

    public OvenTouchScreen(Oven oven) {
        this.oven = oven;
        System.out.println("\nHi, I'm touch Screen. Press turn on button to enable me :)\n" );
    }

    @Override
    public void power() {
        if(oven.isOn()){
            oven.turnOff();
            oven.setTime(0);
            oven.setHeatingType(0);
            System.out.println("Okay, I hope I helped you today, bye!");
        }else{
            oven.turnOn();
            System.out.println("Thanks. Now I'm enabled.");
        }
    }

    @Override
    public void increaseTime(int time) {
        oven.setTime(time);
        System.out.println("| Time increased to " + time + " minutes |");
    }

    @Override
    public void decreaseTime(int time) {
        oven.setTime(time);
        System.out.println("| Time decreased to " + time + " minutes |");
    }

    @Override
    public void increaseHeatingTypeValue(int value) {
        oven.setHeatingType(value);
        System.out.println("| Oven power increased to " + value + " |");
    }

    @Override
    public void decreaseHeatingTypeValue(int value) {
        oven.setHeatingType(value);
        System.out.println("| Oven power decreased to " + value + " |");
    }
}
