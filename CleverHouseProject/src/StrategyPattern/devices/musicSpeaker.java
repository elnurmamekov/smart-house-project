package StrategyPattern.devices;

import StrategyPattern.AbstractClass.Device;

public class musicSpeaker extends Device {


    @Override
    public void deviceDescription() {
        System.out.println("I'm music speaker.");
    }
}
