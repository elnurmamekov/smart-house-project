package ObserverPattern.publisher;

import ObserverPattern.subscriber.FamilyMember;

public interface MainDeviceInterface {
    void joinMember(FamilyMember member);

    void deleteMember(FamilyMember member);

    void notifyAllMembers();


}
