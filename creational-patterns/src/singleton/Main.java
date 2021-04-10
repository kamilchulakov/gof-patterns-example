package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLogger().toString());
        ProgramLogger.getProgramLogger().log("test");
        ProgramLogger.getProgramLogger().log("test");
        System.out.println(ProgramLogger.getProgramLogger().toString());
        ProgramLogger.getProgramLogger().printLog();
    }
}
