package pl.pawoz.carshop.carShop.orders;

import pl.pawoz.carshop.carShop.shared.OrderId;

public interface OrderRepository {

    Order find(OrderId orderId);

    void save(Order order);
}
