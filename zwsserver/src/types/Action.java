package types;

public class Action {

    private String description;
    private double price;
    private double time;
    private String venik;

    public Action() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setVenik(String venik) {
        this.venik = venik;
    }

    public Action(String description, double price, double time, String venik) {
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
        return venik;
    }

    @Override
    public String toString(){
        return description + "\t" + price + "\t" + time + "\t" + venik;
    }

}
