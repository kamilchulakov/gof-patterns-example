package abstract_factory;

import java.util.ArrayList;

public interface ProjectTeamFactory {
    ArrayList<Developer> getDevelopers();
    Tester getTester();
}
