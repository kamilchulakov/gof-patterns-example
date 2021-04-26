package bridge;

public class DjangoApp extends Program{
    protected DjangoApp(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("DjangoApp development in progress...");
        developer.writeCode();
        developer.writeCode();
        developer.writeCode();
        developer.writeCode();
        developer.writeCode();
        developer.writeCode();
    }
}
