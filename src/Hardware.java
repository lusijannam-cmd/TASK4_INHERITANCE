public abstract class Hardware {
    protected int id;
    protected String brand;
    protected int spec;

    public Hardware(int id, String brand, int spec) {
        this.id = id;
        this.brand = brand;
        this.spec = spec;
    }

    public abstract String interpretSpec();

    public int getId() {
        return id;
    }

    public int getSpec() {
        return spec;
    }

    public String getBrand() {
        return brand;
    }
}