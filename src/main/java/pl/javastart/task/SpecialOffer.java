package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String time;
    String describeOffer;
    double bonus;

    public SpecialOffer(Product product, String time, double bonus, String describeOffer) {
        this.product = product;
        this.time = time;
        this.bonus = bonus;
        this.describeOffer = describeOffer;
    }

    double priceWithBonus() {
        return this.product.price - this.product.price * this.bonus;
    }

}
