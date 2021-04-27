package decorator;

public class SeniorJavaDEveloper extends DeveloperDecorator{
    public SeniorJavaDEveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "code review";
    }

    @Override
    public String getCode() {
        return super.getCode() + " + " + makeCodeReview();
    }
}
