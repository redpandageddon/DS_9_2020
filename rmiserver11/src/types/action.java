package types;

import java.io.Serializable;

public class action implements Serializable {
    
    private String description;
    private double price;
    private double time;
    private branch venik;

    public action(String description, double price, double time, branch venik) {
        this.description = description;
        this.price = price;
        this.time = time;
        this.venik = venik;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }
    
    public String getVenik() {
        return venik.toString();
    }
    
    @Override
    public String toString(){
        return description + "\t" + price + "\t" + time + "\t" + venik.toString();
    }
}
