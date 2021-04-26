package builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new MyBuilder());
        System.out.println(director.buildWebsite());
        director.setBuilder(new HisBuilder());
        System.out.println(director.buildWebsite());
    }
}
