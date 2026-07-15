package com.springcore;

import com.springcore.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;

    @Autowired
    OrderService(@Qualifier("cardPayment") PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.payment();
        System.out.println("Order Placed");
    }
}
