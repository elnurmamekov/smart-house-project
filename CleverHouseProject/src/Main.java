import ObserverPattern.MainDevice;
import ObserverPattern.Member;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        MainDevice mainDevice = new MainDevice();

        while(on){
            System.out.println("Hi, choose what u want:");
            String option = sc.next();

            if(option.equals("Join")){
                System.out.println("what's your name?\n");
                String name = sc.next();

                Member member = new Member(name);

                mainDevice.joinMember(member);
            }

            if(option.equals("Clean")){

                System.out.println("What type of cleaning you wish?\n" +
                        "- dry\n" +
                        "- full\n" +
                        "- medium\n");
                option = sc.next();

                if(option.equals("dry")){

                }
                if(option.equals("medium")){

                }
                if(option.equals("full")){

                }

            }



            if(option.equals("Exit")){
                on = false;
            }

        }
    }
}
