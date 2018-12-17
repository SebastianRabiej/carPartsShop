package pl.pawoz.carshop.carShop.cart;

public class Product {

    private double price;

    protected Product(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{}";
    }

    public double getPrice() {
        return price;
    }
}
