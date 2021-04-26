package bridge_2;

public class SmartJoyStick extends JoyStick{
    public void smartButton() {
        _console.executeCommand("X");
        _console.executeCommand("Y");
    }
}
