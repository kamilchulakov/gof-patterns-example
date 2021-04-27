package flyweight;

import composite.Box;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Created java developer");
                    developer = new JavaDeveloper();
                    break;

                default:
                    System.out.println("Created " + specialty + " developer");
                    developer = new JavaDeveloper();
                    break;
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
