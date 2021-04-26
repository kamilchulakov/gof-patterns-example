package bridge_2;

public class Console1 implements IConsole{
    @Override
    public void executeCommand(String command) {
        System.out.println("Console 1 executed command: "+ command);
    }
}
