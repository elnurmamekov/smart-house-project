import AdapterPattern.AmericanTimeFormatAdapter;
import AdapterPattern.CurrentTime;
import AdapterPattern.MilitaryFormatTime;
import AdapterPattern.TimeConverter;
import BridgePattern.concreteAbstractions.OvenTouchScreen;
import DecoratorPattern.component.CleaningRobotMachineComponent;
import DecoratorPattern.concreteComponent.CleaningRobotMachine;
import DecoratorPattern.concreteDecorators.VacuumCleaning;
import DecoratorPattern.concreteDecorators.WashingPowderCleaning;
import DecoratorPattern.concreteDecorators.WetCleaning;
import FactoryPattern.concreteCreator.GasStoveFactory;
import FactoryPattern.concreteCreator.MicrowaveFactory;
import FactoryPattern.factory.OvenFactory;
import FactoryPattern.product.Oven;
import ObserverPattern.concretePublisher.MainDevice;
import ObserverPattern.concreteSubscribers.Member;
import StrategyPattern.Extentions.CleanWithoutMusic;
import StrategyPattern.Extentions.OpenDoorHorizontally;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        boolean on = true;

        //Observer pattern object creation
        MainDevice mainDevice = new MainDevice();

        while(on){
            System.out.println("Hi, choose what u want:");
            String option = sc.next();

            // Join option
            if(option.equals("Join")){
                System.out.println("what's your name?\n");
                String name = sc.next();
                //Observer pattern object creation
                Member member = new Member(name);

                mainDevice.joinMember(member);
            }

            // Clean option
            else if(option.equals("Clean")){
                //Decorator pattern object creation
                CleaningRobotMachineComponent methods = null;
                //Strategy pattern object creation
                CleaningRobotMachine robotMachine = new CleaningRobotMachine(new CleanWithoutMusic(), new OpenDoorHorizontally());

                System.out.println("What type of cleaning you wish?\n" +
                        "- vacuum cleaning\n" +
                        "- wet cleaning\n" +
                        "- washing powder cleaning\n");
                option = sc.next();

                if(option.equals("vacuumCleaning")){
                    methods = new VacuumCleaning(new CleaningRobotMachine(new CleanWithoutMusic(), new OpenDoorHorizontally()));
                }
                else if(option.equals("wetCleaning")){
                    methods = new WetCleaning(new VacuumCleaning(new CleaningRobotMachine(new CleanWithoutMusic(), new OpenDoorHorizontally())));
                }
                else if(option.equals("powderCleaning")){
                    methods = new WetCleaning(new WashingPowderCleaning(new VacuumCleaning(new CleaningRobotMachine(new CleanWithoutMusic(), new OpenDoorHorizontally()))));
                }

                assert methods != null;
                //Strategy pattern method calling
                robotMachine.performCleaning();
                robotMachine.deviceDescription();
                //Decorator pattern method calling
                System.out.println(methods.getCollectedModeInfo());
            }

            // Oven option
            else if(option.equals("Oven")){
                //Factory pattern object creation
                OvenFactory ovenFactory = null;
                Oven oven = null;

                System.out.println("Which type of oven you want to use?\n" +
                        "- microwave\n" +
                        "- gas stove");

                option = sc.next();

                if(option.equals("microwave")){
                    ovenFactory = new MicrowaveFactory();
                    oven = ovenFactory.createOven();

                    //Bridge pattern object creation
                    OvenTouchScreen touchScreen = new OvenTouchScreen(oven);
                    // turning on touch screen
                    touchScreen.power();

                    System.out.println("What properties to set?\n" +
                            "1. insert time(0- 30 min): \n");
                    option = sc.next();

                    // increasing time method from Bridge pattern
                    touchScreen.increaseTime(Integer.parseInt(option));
                    System.out.println("2. insert power(0 - 800): ");

                    option = sc.next();

                    // increasing power method from Bridge pattern
                    touchScreen.increaseHeatingTypeValue(Integer.parseInt(option));

                    //info method from Factory pattern
                    oven.info();
                    // turning off touch screen
                    touchScreen.power();
                }
                else if(option.equals("gasStove")){
                    ovenFactory = new GasStoveFactory();
                    oven = ovenFactory.createOven();

                    //Bridge pattern object creation
                    OvenTouchScreen touchScreen = new OvenTouchScreen(oven);
                    // turning on touch screen
                    touchScreen.power();

                    System.out.println("What properties to set?\n" +
                            "1. insert time: ");
                    option = sc.next();

                    // increasing time method from Bridge pattern
                    touchScreen.increaseTime(Integer.parseInt(option));
                    System.out.println("2. insert temperature(0 - 250 C):");

                    option = sc.next();

                    // increasing power method from Bridge pattern
                    touchScreen.increaseHeatingTypeValue(Integer.parseInt(option));

                    //info method from Factory pattern
                    oven.info();
                    // turning off touch screen
                    touchScreen.power();
                }
            }

            // Alarm clock option
            else if(option.equals("Alarm")){
                System.out.println("Set time you want to wake up:");
                option = sc.next();
            }

            else if(option.equals("changeTimeFormat")){
                MilitaryFormatTime currentTwentyFourFormatTime = new CurrentTime();
                AmericanTimeFormatAdapter adapter = new TimeConverter(currentTwentyFourFormatTime);

                System.out.println("\n-----------------------------------------\n" +
                        "Current time in 24-hour format: " + currentTwentyFourFormatTime.getTime()+
                        "\n-----------------------------------------\n");
                System.out.println("--------------------------------------------\n" +
                        "Current time in 12-hour format: "  +adapter.getTime()+
                        "\n--------------------------------------------\n");
            }

            // Exit option
            else if(option.equals("Exit")){
                on = false;
            }

            // Choose again option
            else {
                System.out.println("This home don't have your requesting operation. Try to choose another devices :)");
            }

        }
    }

}
