package factory.method;

public class Main {
    public static void main(String[] args) {
        HumanFactory humanFactory = createHumanFactoryBYSpecialty("stupid guy");
        humanFactory.createHuman().doSomething();
    }
    private static HumanFactory createHumanFactoryBYSpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("scientist")) return new RickFactory();
        if (specialty.equalsIgnoreCase("jerry") | specialty.equalsIgnoreCase("stupid guy")) return new JerryFactory();
        else return new MortyFactory();
    }
}
