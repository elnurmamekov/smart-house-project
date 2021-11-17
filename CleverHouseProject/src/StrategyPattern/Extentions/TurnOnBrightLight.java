package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.ITurnOnLightLampBehavior;

public class TurnOnBrightLight implements ITurnOnLightLampBehavior {
    @Override
    public void turnOnLight() {
        System.out.println("Bright light is turned on.");
    }
}
