package abstract_factory;

public class PM {
    public void manageProject(WebsiteProject websiteProject) {
        websiteProject.getWorkers();
        websiteProject.start();
    }
}
