package bridge_2;

public class Main {
    public static void main(String[] args) {
        IConsole console = new Console1();
        SmartJoyStick joyStick = new SmartJoyStick();
        joyStick.set_console(console);
        joyStick.smartButton();
        joyStick.set_console(new Console2());
        joyStick.sendX();
        joyStick.smartButton();
    }
}
