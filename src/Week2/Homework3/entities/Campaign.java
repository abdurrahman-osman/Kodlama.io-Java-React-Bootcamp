package Week2.Homework3.entities;

public class Campaign extends BaseEntity{
    private String description;
    private double discountRate;

    public Campaign(int id, String name, String description, double discountRate) {
        super(id, name);
        this.description = description;
        this.discountRate = discountRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}
