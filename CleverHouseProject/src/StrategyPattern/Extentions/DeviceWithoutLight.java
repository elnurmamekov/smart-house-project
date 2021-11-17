package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.ITurnOnLightLampBehavior;

public class DeviceWithoutLight implements ITurnOnLightLampBehavior {
    @Override
    public void turnOnLight() {
        System.out.println("Light lamp is not installed.");
    }
}
