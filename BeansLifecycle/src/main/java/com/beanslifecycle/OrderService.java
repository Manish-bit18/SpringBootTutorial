package com.beanslifecycle;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;

    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void order(){
        paymentService.pay();
        System.out.println("Order Placed");

    }
}
