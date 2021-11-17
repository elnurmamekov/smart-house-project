package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.IOpenDoorBehavior;

public class OpenDoorVertically implements IOpenDoorBehavior {

    @Override
    public void open() {
        System.out.println("Door opened vertically.");
    }
}
