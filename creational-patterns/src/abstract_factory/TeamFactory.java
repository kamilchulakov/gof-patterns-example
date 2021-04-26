package abstract_factory;

import java.util.ArrayList;

public class TeamFactory implements ProjectTeamFactory{
    public ArrayList<Developer> getDevelopers() {
        ArrayList<Developer> arrayList = new ArrayList<>();
        arrayList.add(new JavaDeveloper(0L));
        arrayList.add(new JavaDeveloper(10L));
        return arrayList;
    }

    @Override
    public Tester getTester() {
        return new Tester();
    }
}
