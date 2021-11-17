package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.IOpenDoorBehavior;

public class DeviceWithoutDoor implements IOpenDoorBehavior {
    @Override
    public void open() {
        System.out.println("Door is not installed.");
    }
}
