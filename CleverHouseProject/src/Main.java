import AdapterPattern.AmericanTimeFormatAdapter;
import AdapterPattern.CurrentTime;
import AdapterPattern.MilitaryFormatTime;
import AdapterPattern.TimeConverter;
import BridgePattern.concreteAbstractions.OvenTouchScreen;
import DecoratorPattern.*;
import FactoryPattern.ConcreteCreator.GasStoveFactory;
import FactoryPattern.ConcreteCreator.MicrowaveFactory;
import FactoryPattern.Factory.OvenFactory;
import FactoryPattern.Product.Oven;
import FactoryPattern.concreteProduct.Microwave;
import ObserverPattern.MainDevice;
import ObserverPattern.Member;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        boolean on = true;

        MainDevice mainDevice = new MainDevice();

        while(on){
            System.out.println("Hi, choose what u want:");
            String option = sc.next();

            // Join option
            if(option.equals("Join")){
                System.out.println("what's your name?\n");
                String name = sc.next();

                Member member = new Member(name);

                mainDevice.joinMember(member);
            }

            // Clean option
            else if(option.equals("Make wet cleaning")){
                CleaningRobotMachineComponent methods = null;

                System.out.println("What type of cleaning you wish?\n" +
                        "- vacuum cleaning\n" +
                        "- wet cleaning\n" +
                        "- washing powder cleaning\n");
                option = sc.next();

                if(option.equals("vacuumCleaning")){
                    methods = new VacuumCleaning(new CleaningRobotMachine());
                }
                else if(option.equals("wetCleaning")){
                    methods = new WetCleaning(new VacuumCleaning(new CleaningRobotMachine()));
                }
                else if(option.equals("powderCleaning")){
                    methods = new WetCleaning(new WashingPowderCleaning(new VacuumCleaning(new CleaningRobotMachine())));
                }

                assert methods != null;
                System.out.println(methods.getCollectedModeInfo());
            }

            // Oven option
            else if(option.equals("Oven")){
                OvenFactory ovenFactory = null;
                Oven oven = null;

                System.out.println("Which type of oven you want to use?\n" +
                        "- microwave\n" +
                        "- gas stove");

                option = sc.next();

                if(option.equals("microwave")){
                    ovenFactory = new MicrowaveFactory();
                    oven = ovenFactory.createOven();

                    OvenTouchScreen touchScreen = new OvenTouchScreen(oven);
                    // turning on touch screen
                    touchScreen.power();

                    System.out.println("What properties to set?\n" +
                            "1. insert time(0- 30 min): \n");
                    option = sc.next();

                    touchScreen.increaseTime(Integer.parseInt(option));
                    System.out.println("2. insert power(0 - 800): ");

                    option = sc.next();

                    touchScreen.increaseHeatingTypeValue(Integer.parseInt(option));

                    oven.info();
                    // turning off touch screen
                    touchScreen.power();
                }
                else if(option.equals("gasStove")){
                    ovenFactory = new GasStoveFactory();
                    oven = ovenFactory.createOven();

                    OvenTouchScreen touchScreen = new OvenTouchScreen(oven);
                    // turning on touch screen
                    touchScreen.power();

                    System.out.println("What properties to set?\n" +
                            "1. insert time: ");
                    option = sc.next();

                    touchScreen.increaseTime(Integer.parseInt(option));
                    System.out.println("2. insert temperature(0 - 250 C):");

                    option = sc.next();

                    touchScreen.increaseHeatingTypeValue(Integer.parseInt(option));

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
