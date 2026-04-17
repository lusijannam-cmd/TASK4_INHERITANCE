class Laptop extends Hardware {
    public Laptop(int id, String brand, int spec) {
        super(id, brand, spec);
    }

    @Override
    public String interpretSpec() {
        return spec + "GB RAM";
    }
}