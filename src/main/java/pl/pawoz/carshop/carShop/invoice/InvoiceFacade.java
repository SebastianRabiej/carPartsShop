package pl.pawoz.carshop.carShop.invoice;

import pl.pawoz.carshop.carShop.orders.OrderFacade;
import pl.pawoz.carshop.carShop.orders.out.OrderDTO;
import pl.pawoz.carshop.carShop.shared.OrderId;

public class InvoiceFacade {

    private final OrderFacade orderFacade;
    private final CreateInvoicePolicy createInvoicePolicy;


    public InvoiceFacade(OrderFacade orderFacade, CreateInvoicePolicy createInvoicePolicy) {
        this.orderFacade = orderFacade;
        this.createInvoicePolicy = createInvoicePolicy;
    }

    public Invoice createInvoice(OrderId orderId) {
        OrderDTO orderDTO = orderFacade.findOrderById(orderId);
        Invoice invoice = createInvoicePolicy.create(orderDTO);

        return invoice;
    }
}
