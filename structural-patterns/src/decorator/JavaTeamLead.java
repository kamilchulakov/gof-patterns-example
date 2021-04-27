package decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String getWeekReport() {
        return "week report";
    }

    @Override
    public String getCode() {
        return super.getCode() + " + " + getWeekReport();
    }
}
