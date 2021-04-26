package abstract_factory;

public class JavaDeveloper implements Developer{

    private Long experience;

    public JavaDeveloper(Long experience) {
        this.experience = experience;
    }

    @Override
    public void writeCode() {
        experience += 1;
        System.out.println("Java Developer writes java code.");
    }
}
