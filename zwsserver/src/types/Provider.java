package types;

public class Provider {
    private int cooperation;
    private String name;
    private String product;

    public Provider() {
    }

    public Provider(int cooperation, String name, String product) {
        this.cooperation = cooperation;
        this.name = name;
        this.product = product;
    }

    public int getCooperation() {
        return cooperation;
    }

    public void setCooperation(int cooperation) {
        this.cooperation = cooperation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
