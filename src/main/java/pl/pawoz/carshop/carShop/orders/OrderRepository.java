package pl.pawoz.carshop.carShop.orders;

public interface OrderRepository {

    Order find(OrderId orderId);

    void save(Order order);
}
