package duck.choice;

public class Clothing {
    String description;
    double price;
    String size = "M";

    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = 0.02;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price + MIN_TAX);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
