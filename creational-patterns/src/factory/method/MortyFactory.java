package factory.method;

public class MortyFactory implements HumanFactory{
    @Override
    public Human createHuman() {
        return new Morty();
    }
}
