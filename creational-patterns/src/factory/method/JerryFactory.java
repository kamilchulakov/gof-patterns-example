package factory.method;

public class JerryFactory implements HumanFactory{
    @Override
    public Human createHuman() {
        return new Jerry();
    }
}
