package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.ITurnOnLightLampBehavior;

public class TurnOnLessConsumedLight implements ITurnOnLightLampBehavior {
    @Override
    public void turnOnLight() {
        System.out.println("Less consumed light is turned on.");
    }
}
