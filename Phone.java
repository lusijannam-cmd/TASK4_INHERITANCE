
class Phone extends Hardware {
    public Phone(int id, String brand, int spec) {
        super(id, brand, spec);
    }

    @Override
    public String interpretSpec() {
        return spec + " Megapixels";
    }
}