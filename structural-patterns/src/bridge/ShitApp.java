package bridge;

public class ShitApp extends Program{
    protected ShitApp(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("ShitApp development in progress...");
        developer.writeCode();
        System.out.println("ShitApp development has finished!");
    }
}
