package pl.pawoz.carshop.carShop.orders;

import pl.pawoz.carshop.carShop.orders.Order;
import pl.pawoz.carshop.carShop.orders.OrderId;
import pl.pawoz.carshop.carShop.orders.OrderRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {

    private Map<OrderId, Order> map = new HashMap<>();

    @Override
    public Order find(OrderId orderId) {
        return map.get(orderId);
    }

    @Override
    public void save(Order order) {
        map.put(order.getOrderId(), order);

    }
}
