package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.ITurnOnLightLampBehavior;

public class TurnOnWithFlashingLight implements ITurnOnLightLampBehavior {
    @Override
    public void turnOnLight() {
        System.out.println("Flashing light is turned on.");
    }
}
