package pl.pawoz.carshop.carShop.orders;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import pl.pawoz.carshop.carShop.cart.Cart;

import static org.assertj.core.api.Assertions.assertThat;

class OrdersTest {

    private static OrderFacade orderFacade;

    @BeforeAll
    public static void init() {
        orderFacade = new OrderFacade(new InMemoryOrderRepository());
    }

    @Test
    public void should_create_order_and_save_id() {
        //given
        Cart cart = new Cart();

        //when
        OrderId orderId = orderFacade.makeOrder(cart);

        //then
        Order order = orderFacade.findOrderById(orderId);
        assertThat(order.getOrderId()).isEqualTo(orderId);
    }

    @Test
    public void should_create_order_with_price_as_multiplication_of_part_price() {

    }

}
