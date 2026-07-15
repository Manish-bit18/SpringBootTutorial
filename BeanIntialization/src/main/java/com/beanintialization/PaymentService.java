package com.beanintialization;

import jdk.jfr.Label;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class PaymentService {

    private OrderService orderService;
    PaymentService( OrderService orderService){
        this.orderService = orderService;
    }
    public void pay(){

        System.out.println("Payment Done");
        orderService.orderDetails();
    }
}
