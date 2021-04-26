package bridge_2;

public abstract class JoyStick {
    protected IConsole _console;

    public void set_console(IConsole _console) {
        this._console = _console;
    }

    public void sendX() {
        _console.executeCommand("X");
    }

    public void sendY() {
        _console.executeCommand("Y");
    }
}
