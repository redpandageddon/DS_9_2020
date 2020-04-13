package types;

import java.io.Serializable;

public class postavshik implements Serializable {
    
    private int cooperation;
    private String name;
    private rashodnik product;

    public int getCooperation() {
        return cooperation;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product.toString();
    }

    public postavshik(int cooperation, String name, rashodnik product) {
        this.cooperation = cooperation;
        this.name = name;
        this.product = product;
    }
    
}
