package singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logInfo = "Log:\n";

    private ProgramLogger() {

    }

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) programLogger = new ProgramLogger();
        return programLogger;
    }

    public void log(String message) {
        logInfo += message + "\n";
    }

    public void printLog() {
        System.out.println(logInfo);
    }
}
