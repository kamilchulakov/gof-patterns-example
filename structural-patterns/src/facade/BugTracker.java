package facade;

public class BugTracker {
    private boolean activeSprint;

    public void startSprint() {
        activeSprint = true;
        System.out.println("SPRINT IS ACTIVE.");
    }

    public void finishSprint() {
        activeSprint = false;
        System.out.println("SPRINT IS FINISHED.");
    }

    public boolean isActiveSprint() {
        return activeSprint;
    }
}
