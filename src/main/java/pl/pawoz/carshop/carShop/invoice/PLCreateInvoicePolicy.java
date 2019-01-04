package pl.pawoz.carshop.carShop.invoice;

import pl.pawoz.carshop.carShop.orders.out.OrderDTO;

public class PLCreateInvoicePolicy implements CreateInvoicePolicy {
    @Override
    public Invoice create(OrderDTO orderDTO) {
        return new Invoice(orderDTO.getSummaryPrice() * 1.23);
    }
}
