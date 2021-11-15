package DecoratorPattern;

public class CleaningRobotMachineDecorator implements CleaningRobotMachineComponent{
    private CleaningRobotMachineComponent cleaningRobotMachineComponent;

    public CleaningRobotMachineDecorator(CleaningRobotMachineComponent cleaningRobotMachineComponent) {
        this.cleaningRobotMachineComponent = cleaningRobotMachineComponent;
    }

    @Override
    public String addCleaningMethod() {
        return cleaningRobotMachineComponent.addCleaningMethod();
    }

    @Override
    public int getCleaningTime() {
        return cleaningRobotMachineComponent.getCleaningTime();
    }

    @Override
    public String getCollectedModeInfo() {
        return cleaningRobotMachineComponent.getCollectedModeInfo();
    }
}
