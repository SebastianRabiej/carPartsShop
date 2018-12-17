package pl.pawoz.carshop.carShop.orders;

class Order {
    private OrderId orderId;
    private double summaryPrice;

    public Order(double summaryPrice) {
        this.orderId = new OrderId();
        this.summaryPrice = summaryPrice;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public double getSummaryPrice() {
        return summaryPrice;
    }
}
