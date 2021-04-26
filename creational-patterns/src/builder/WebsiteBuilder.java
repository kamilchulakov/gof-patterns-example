package builder;

public abstract class WebsiteBuilder {
    Website website;

    public void buildWebsite() {
        website = new Website();
        buildName();
        buildBack();
        buildLicense();
    }

    abstract void buildName();
    abstract void buildBack();
    abstract void buildLicense();

    public Website getWebsite() {
        return website;
    }
}
