package builder;

public class HisBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("His site.");
    }

    @Override
    void buildBack() {
        website.setBack("Python Django");
    }

    @Override
    void buildLicense() {
        website.setLicense(License.GPL2);
    }
}
