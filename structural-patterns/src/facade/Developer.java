package facade;

public class Developer {
    public void workWhenSprint(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) System.out.println("WRITING CODE...");
        else System.out.println("WASTING TIME...");
    }
}
