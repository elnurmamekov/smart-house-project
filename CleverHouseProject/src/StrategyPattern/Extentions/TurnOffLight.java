package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.ITurnOnLightLampBehavior;

public class TurnOffLight implements ITurnOnLightLampBehavior {
    @Override
    public void turnOnLight() {
        System.out.println("Light is turned off.");
    }
}
