package DecoratorPattern.concreteDecorators;

import DecoratorPattern.component.CleaningRobotMachineComponent;
import DecoratorPattern.baseDecorator.CleaningRobotMachineDecorator;

public class VacuumCleaning extends CleaningRobotMachineDecorator {
    public VacuumCleaning(CleaningRobotMachineComponent cleaningRobotMachineComponent) {
        super(cleaningRobotMachineComponent);
    }

    @Override
    public String addCleaningMethod() {
        return super.addCleaningMethod() + "It's vacuum cleaner mode. Suck out all of the dust.";
    }

    @Override
    public int getCleaningTime() {
        return super.getCleaningTime() + 10;
    }

    @Override
    public String getCollectedModeInfo() {
        return super.getCollectedModeInfo() + "Sucking out... Takes 10 minutes...\n";
    }
}
