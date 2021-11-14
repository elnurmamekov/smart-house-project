package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class MainDevice implements MainDeviceInterface{
    List<String> functionalities = new ArrayList<>();
    List<FamilyMember> members = new ArrayList<>();

    public void addFunctionality(String functionality){
        functionalities.add(functionality);
        notifyAllMembers();
    }


    @Override
    public void joinMember(FamilyMember member) {
        members.add(member);
    }

    @Override
    public void deleteMember(FamilyMember member) {
        members.remove(member);
    }

    @Override
    public void notifyAllMembers() {
        for (FamilyMember member : members) {
            member.update(functionalities.get(functionalities.size() - 1));
        }
    }
}
