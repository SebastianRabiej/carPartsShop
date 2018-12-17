package pl.pawoz.carshop.carShop.cart;

import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class CartTest {

    final double ANY_PRICE = 3;

    @Test
    public void should_return_empty_list_when_cart_is_empty() {
        //Given
        Cart cart = new Cart();

        //When
        //do nothing

        //Then
        assertThat(cart.getProductsInCart()).isEmpty();
    }

    @Test
    public void should_return_list_containing_one_element_when_one_element_is_in_cart() {
        //Given
        Cart cart = new Cart();

        //When
        cart.addProductToCart(19, new Wheels(ANY_PRICE));

        //Then
        assertThat(cart.getProductsInCart()).hasSize(1);
    }

    @Test
    public void should_return_list_containing_one_element_when_add_two_elements_to_cart() {
        //Given
        Cart cart = new Cart();

        //When
        for (int i = 0; i < 2; i++) {
            cart.addProductToCart(19, new Wheels(ANY_PRICE));
        }

        //Then
        assertThat(cart.getProductsInCart()).hasSize(1);
    }
}
