package designpatterns.decorator;

public abstract class Drink {
    private float price = 0;
    private String description;

    public abstract float cost();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description + ":"+this.getPrice();
    }
}
