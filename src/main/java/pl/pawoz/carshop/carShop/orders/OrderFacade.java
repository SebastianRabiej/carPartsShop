package pl.pawoz.carshop.carShop.orders;


import pl.pawoz.carshop.carShop.cart.OrderItem;

import java.util.List;

public class OrderFacade {


    private OrderRepository orderRepository;

    public OrderFacade(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderId makeOrder(List<OrderItem> orderItems) {
        double summaryPriceForProductsInCart = 0;

        for (OrderItem orderItem : orderItems) {
            summaryPriceForProductsInCart += orderItem.summaryPrice();
        }

        Order order = new Order(summaryPriceForProductsInCart);

        orderRepository.save(order);

        return order.getOrderId();
    }

    public OrderDTO findOrderById(OrderId orderId) {
        Order order = orderRepository.find(orderId);
        return new OrderDTO(order.getOrderId(), order.getSummaryPrice());
    }
}
