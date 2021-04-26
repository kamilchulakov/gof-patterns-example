package builder;

public class Website {
    private String name;
    private String back;
    private License license;

    public void setLicense(License license) {
        this.license = license;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBack(String back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", back='" + back + '\'' +
                ", license='"+ license + "'" +
                '}';
    }
}
