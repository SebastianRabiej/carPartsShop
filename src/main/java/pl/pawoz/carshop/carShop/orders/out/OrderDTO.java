package pl.pawoz.carshop.carShop.orders.out;

import pl.pawoz.carshop.carShop.shared.OrderId;

public class OrderDTO {
    private OrderId orderId;

    private double summaryPrice;

    public OrderDTO(OrderId orderId, double summaryPrice) {
        this.orderId = orderId;
        this.summaryPrice = summaryPrice;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public double getSummaryPrice() {
        return summaryPrice;
    }
}