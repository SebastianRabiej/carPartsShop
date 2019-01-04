package pl.pawoz.carshop.carShop.invoice;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;
import pl.pawoz.carshop.carShop.orders.OrderFacade;
import pl.pawoz.carshop.carShop.orders.out.OrderDTO;
import pl.pawoz.carshop.carShop.shared.OrderId;

public class InvoiceTest {

    @Test
    public void should_calculate_invoice_for_PL() {

        //given
        OrderId orderId = new OrderId();
        OrderFacade orderFacade = Mockito.mock(OrderFacade.class);
        InvoiceFacade invoiceFacade = new InvoiceFacade(orderFacade, new PLCreateInvoicePolicy());
        Mockito.when(orderFacade.findOrderById(orderId)).thenReturn(new OrderDTO(orderId, 100));

        //when
        Invoice invoice = invoiceFacade.createInvoice(orderId);

        //then
        Assertions.assertThat(invoice.getValue()).isEqualByComparingTo(123d);
    }
}
