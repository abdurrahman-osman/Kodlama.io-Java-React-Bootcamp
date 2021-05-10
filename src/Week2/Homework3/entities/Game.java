package Week2.Homework3.entities;

public class Game extends BaseEntity{
    private double price;

    public Game(int id, String name, double price) {
        super(id, name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
