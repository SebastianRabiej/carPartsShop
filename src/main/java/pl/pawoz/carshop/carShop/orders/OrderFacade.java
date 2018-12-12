package pl.pawoz.carshop.carShop.orders;


import pl.pawoz.carshop.carShop.cart.Cart;

public class OrderFacade {

    private OrderRepository orderRepository;

    public OrderFacade(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderId makeOrder(Cart cart) {
        Order order = new Order();
        orderRepository.save(order);
        return order.getOrderId();
    }

    public Order findOrderById(OrderId orderId) {
        return orderRepository.find(orderId);
    }
}
