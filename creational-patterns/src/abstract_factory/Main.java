package abstract_factory;

public class Main {
    public static void main(String[] args) {
        PM pm = new PM();
        WebsiteProject websiteProject = new WebsiteProject();
        pm.manageProject(websiteProject);
    }
}
