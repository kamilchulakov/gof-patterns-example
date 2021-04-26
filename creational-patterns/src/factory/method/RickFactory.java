package factory.method;

public class RickFactory implements HumanFactory{
    @Override
    public Human createHuman() {
        return new Rick();
    }
}
