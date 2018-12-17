package pl.pawoz.carshop.carShop.cart;

public class OrderItem {
    private int amount;

    private Product product;

    public OrderItem(int amount, Product product) {
        this.amount = amount;
        this.product = product;
    }

    public void increaseAmountBy(int amount) {
        this.amount += amount;
    }

    public double summaryPrice() {
        return amount * product.getPrice();
    }

    public int getAmount() {
        return amount;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "amount = " + amount +
                ", product = " + product +
                '}';
    }
}
