package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.ICleanBehavior;

public class CleanWithMusic implements ICleanBehavior {
    @Override
    public void clean() {
        System.out.println("I'm cleaning with turned on music.");
    }
}
