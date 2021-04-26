package builder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.buildWebsite();
        return builder.getWebsite();
    }
}
