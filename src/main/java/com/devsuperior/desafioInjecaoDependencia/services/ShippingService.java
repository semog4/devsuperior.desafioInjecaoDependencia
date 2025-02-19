package com.devsuperior.desafioInjecaoDependencia.services;

import com.devsuperior.desafioInjecaoDependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment( Order order ){

        double valorEnvio = 0.0;

        if ( order.getBasic() < 100 ){
            valorEnvio = 20.0;
        }else{
            if ( order.getBasic() >= 100.0 && order.getBasic() < 200.0 ){
                valorEnvio = 12.0;
            }
        }
        return valorEnvio;

    }
}
