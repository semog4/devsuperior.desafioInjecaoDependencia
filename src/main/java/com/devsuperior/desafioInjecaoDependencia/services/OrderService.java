package com.devsuperior.desafioInjecaoDependencia.services;

import com.devsuperior.desafioInjecaoDependencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total( Order order ){

        double valorDescontoPedido = order.getBasic() * (order.getDiscount()/100);
        double valorEnvioPedido = shippingService.shipment(order);

        double valorTotalPedido = ( order.getBasic() - valorDescontoPedido ) + valorEnvioPedido;

        return valorTotalPedido;
    }


}
