package pl.pawoz.carshop.carShop.orders;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.pawoz.carshop.carShop.cart.Cart;
import pl.pawoz.carshop.carShop.cart.Doors;
import pl.pawoz.carshop.carShop.orders.out.OrderDTO;
import pl.pawoz.carshop.carShop.shared.OrderId;

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
        OrderId orderId = orderFacade.makeOrder(cart.getProductsInCart());

        //then
        OrderDTO order = orderFacade.findOrderById(orderId);
        assertThat(order.getOrderId()).isEqualTo(orderId);
    }

    @Test
    public void should_create_order_with_price_as_multiplication_of_part_price() {
        //given
        Cart cart = new Cart();
        cart.addProductToCart(3, new Doors(2.5));
        double expectedPrice = 7.5;
        //when
        OrderId orderId = orderFacade.makeOrder(cart.getProductsInCart());

        //then
        OrderDTO order = orderFacade.findOrderById(orderId);
        assertThat(order.getSummaryPrice()).isEqualTo(expectedPrice);
    }
}
