package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.IOpenDoorBehavior;

public class OpenDoorHorizontally implements IOpenDoorBehavior {
    @Override
    public void open() {
        System.out.println("Door opened horizontally.");
    }
}
