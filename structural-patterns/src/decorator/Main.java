package decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDEveloper(new JavaDeveloper()));
        System.out.println(developer.getCode());
    }
}
