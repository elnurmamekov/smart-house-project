package DecoratorPattern.concreteDecorators;

import DecoratorPattern.component.CleaningRobotMachineComponent;
import DecoratorPattern.baseDecorator.CleaningRobotMachineDecorator;

public class WetCleaning extends CleaningRobotMachineDecorator {
    public WetCleaning(CleaningRobotMachineComponent cleaningRobotMachineComponent) {
        super(cleaningRobotMachineComponent);
    }

    @Override
    public String addCleaningMethod() {
        return super.addCleaningMethod() + "It's wet cleaning. Wash all floors.";
    }

    @Override
    public int getCleaningTime() {
        return super.getCleaningTime() + 15;
    }

    @Override
    public String getCollectedModeInfo() {
        return super.getCollectedModeInfo() + "Washing all floors... Takes 15 minutes...\n";
    }
}
