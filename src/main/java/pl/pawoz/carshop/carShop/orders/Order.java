package pl.pawoz.carshop.carShop.orders;

class Order {
    private OrderId orderId;

    public Order() {
        this.orderId = new OrderId();
    }

    public OrderId getOrderId() {
        return orderId;
    }
}
