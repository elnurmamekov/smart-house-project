package DecoratorPattern;

public class WashingPowderCleaning extends CleaningRobotMachineDecorator{
    public WashingPowderCleaning(CleaningRobotMachineComponent cleaningRobotMachineComponent) {
        super(cleaningRobotMachineComponent);
    }

    @Override
    public String addCleaningMethod() {
        return super.addCleaningMethod() + "It's detergent. Apply detergent to the floor.";
    }

    @Override
    public int getCleaningTime() {
        return super.getCleaningTime() + 5;
    }

    @Override
    public String getCollectedModeInfo() {
        return super.getCollectedModeInfo() + "Applying detergent to the floor... Takes 5 minutes...\n";
    }
}
