package pl.pawoz.carshop.carShop.invoice;

import pl.pawoz.carshop.carShop.orders.out.OrderDTO;

public interface CreateInvoicePolicy {

    Invoice create(OrderDTO orderDTO);
}