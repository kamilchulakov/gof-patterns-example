package bridge_2;

public class Console2 implements IConsole{
    @Override
    public void executeCommand(String command) {
        System.out.println("Console 2 executed command: "+ command);
    }
}
