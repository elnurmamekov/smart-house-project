package ObserverPattern.concreteSubscribers;

import ObserverPattern.subscriber.FamilyMember;

public class Member implements FamilyMember {
    String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public void update(String functionality) {
        System.out.println("I'm "+name+"\n" +
                "Added new functionality " + functionality);
    }
}
