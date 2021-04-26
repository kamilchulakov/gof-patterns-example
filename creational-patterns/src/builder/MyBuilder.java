package builder;

public class MyBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Hello world!");
    }

    @Override
    void buildBack() {
        website.setBack("Java Spring");
    }

    @Override
    void buildLicense() {
        website.setLicense(License.GPL3);
    }
}
