package DecoratorPattern.concreteComponent;

import DecoratorPattern.component.CleaningRobotMachineComponent;
import StrategyPattern.AbstractClass.Device;

public class CleaningRobotMachine extends Device implements CleaningRobotMachineComponent {

    @Override
    public String addCleaningMethod() {
        return "It's robot cleaning machine :)\n";
    }

    @Override
    public int getCleaningTime() {
        return 0;
    }

    @Override
    public String getCollectedModeInfo() {
        return "You chose mode(-s):\n";
    }

    @Override
    public void deviceDescription() {
        System.out.println("I'm cleaning robot machine.");
    }
}
