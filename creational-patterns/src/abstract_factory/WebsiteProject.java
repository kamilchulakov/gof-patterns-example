package abstract_factory;

import java.util.ArrayList;

public class WebsiteProject {

    private ArrayList<Developer> developers;
    private Tester tester;

    public void getWorkers() {
        TeamFactory teamFactory = new TeamFactory();
        developers = teamFactory.getDevelopers();
        tester = teamFactory.getTester();
    }

    public void start() {
        developers.forEach(Developer::writeCode);
        tester.test();
    }
}
