package facade;

public class Workflow {
    Developer developer = new Developer();
    BugTracker bugTracker = new BugTracker();
    Work work = new Work();

    void solveProblems() {
        work.work();
        bugTracker.startSprint();
        developer.workWhenSprint(bugTracker);
    }

}
