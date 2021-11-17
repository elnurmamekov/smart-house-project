package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.ICleanBehavior;

public class CleanWithoutMusic implements ICleanBehavior {
    @Override
    public void clean() {
        System.out.println("I'm cleaning without music.");
    }
}